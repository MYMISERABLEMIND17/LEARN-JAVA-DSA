import os
import re

src_dir = '/home/tomar_parakram/Music/MY CODE/LEARN-JAVA-DSA/QUESTION SOLVING/src'
output_file = '/home/tomar_parakram/Music/MY CODE/LEARN-JAVA-DSA/QUESTION SOLVING/DSA_Sheet.md'

def determine_approach(code):
    approaches = []
    
    # Binary Search
    if re.search(r'\b(mid|start|end|low|high)\b.*\/.*2', code) or 'binarySearch' in code:
        approaches.append('Binary Search')
        
    # Two Pointers
    if re.search(r'\b(left|right|start|end|i|j)\b', code) and re.search(r'while\s*\(\s*(left\s*<\s*right|start\s*<\s*end|i\s*<\s*j)\s*\)', code):
        approaches.append('Two Pointers')
        
    # Sliding Window
    if re.search(r'\b(window|Math\.max\(.*-.*\)|Math\.min\(.*-.*\))\b', code) and ('left' in code or 'right' in code or 'i' in code or 'j' in code):
        if 'Sliding Window' not in approaches:
            approaches.append('Sliding Window (Possible)')
            
    # Hashing
    if 'HashMap' in code or 'HashSet' in code:
        approaches.append('Hashing')
        
    # Recursion / DFS
    if re.search(r'\b(\w+)\s*\(.*\)\s*\{.*?\b\1\s*\(.*?\).*?\}', code, re.DOTALL):
        # Very rough recursion regex
        pass
    if 'dfs' in code.lower() or 'backtrack' in code.lower():
        approaches.append('DFS / Backtracking')
        
    # BFS
    if 'Queue' in code and 'LinkedList' in code and ('offer' in code or 'add' in code) and 'poll' in code:
        approaches.append('BFS')
        
    # Sorting
    if 'Arrays.sort' in code or 'Collections.sort' in code:
        approaches.append('Sorting')
        
    # Brute Force / Nested Loops
    if re.search(r'for\s*\(.*?\).*?for\s*\(.*?\)', code, re.DOTALL):
        approaches.append('Nested Loops / Brute Force')
        
    # Bit Manipulation
    if '&' in code or '|' in code or '^' in code or '<<' in code or '>>' in code:
        # Exclude common logical operators if possible, but java uses && for logical. 
        # Bitwise is just single.
        if re.search(r'[^&]&[^&]', code) or re.search(r'[^|]\|[^|]', code) or '^' in code or '<<' in code or '>>' in code:
             approaches.append('Bit Manipulation')
             
    # Dynamic Programming
    if 'dp[' in code or 'memo' in code.lower():
        approaches.append('Dynamic Programming')
        
    if not approaches:
        if 'for' in code or 'while' in code:
            approaches.append('Iterative / Math / Logic')
        else:
            approaches.append('Unknown / Basic')
            
    # Remove duplicates but preserve some order
    final_approaches = list(dict.fromkeys(approaches))
    
    # Clean up conflicting or subset approaches
    if 'Binary Search' in final_approaches and 'Nested Loops / Brute Force' in final_approaches:
        # It could be both, let's keep both
        pass
    
    if len(final_approaches) > 1 and 'Nested Loops / Brute Force' in final_approaches:
        # Brute force with something else usually means it's not purely brute force
        pass
        
    return ', '.join(final_approaches)

data = []

for root, dirs, files in os.walk(src_dir):
    for file in files:
        if file.endswith('.java'):
            filepath = os.path.join(root, file)
            rel_path = os.path.relpath(filepath, src_dir)
            
            # Determine status
            status = 'Unknown'
            if 'SOLVED' in rel_path.split(os.sep) and 'UNSOLVED' not in rel_path.split(os.sep):
                status = 'Solved'
            elif 'UNSOLVED' in rel_path.split(os.sep):
                status = 'Unsolved'
            elif 'UNSOLVED' in file.upper():
                status = 'Unsolved'
            else:
                # If not in explicitly solved or unsolved folder, let's assume based on filename or just Uncategorized
                status = 'Uncategorized'
                
            try:
                with open(filepath, 'r', encoding='utf-8') as f:
                    content = f.read()
                    
                # Remove comments to avoid false positives? No, comments might be useful to find "approach"
                approach = determine_approach(content)
                
                # Check for explicit approach comments
                match = re.search(r'(?i)//\s*approach\s*:\s*(.*)', content)
                if match:
                    approach = match.group(1).strip()
                    
                filename = file.replace('.java', '')
                data.append((filename, status, approach, rel_path))
            except Exception as e:
                print(f"Error reading {file}: {e}")

# Sort by status (Solved first), then by filename (try to extract number)
def sort_key(item):
    num_match = re.search(r'\d+', item[0])
    num = int(num_match.group()) if num_match else float('inf')
    status_order = {'Solved': 0, 'Unsolved': 1, 'Uncategorized': 2, 'Unknown': 3}
    return (status_order.get(item[1], 4), num, item[0])

data.sort(key=sort_key)

with open(output_file, 'w', encoding='utf-8') as f:
    f.write("# DSA Question Tracker\n\n")
    f.write("| Problem | Status | Category/Folder | Inferred Approach |\n")
    f.write("|---------|--------|-----------------|-------------------|\n")
    for item in data:
        folder = os.path.dirname(item[3])
        if not folder:
            folder = 'Root'
        f.write(f"| {item[0]} | {item[1]} | {folder} | {item[2]} |\n")

print(f"Sheet generated at {output_file}")
