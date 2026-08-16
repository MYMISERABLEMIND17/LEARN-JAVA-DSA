# 🧠 PARAKRAM's DSA Progress — Complete Review

> **Generated**: August 11, 2026  
> **Repository**: `LEARN-JAVA-DSA/QUESTION SOLVING`

---

## 📊 Executive Summary

| Metric | Count |
|---|---|
| **Total Files** | **170+** |
| **✅ Fully Solved** | **127** |
| **❌ Unsolved / Failed** | **28** |
| **⚠️ Partially Done (WIP / Empty)** | **15** |
| **🏆 Contest Questions Attempted** | **6** |

---

## 🟢 SOLVED QUESTIONS (127 Total)

### SOLVED/leetcode/ (117 files)

| # | Problem | Difficulty | Approach Used | Code Quality Notes |
|---|---------|-----------|---------------|-------------------|
| 1 | Two Sum | Easy | Brute Force O(n²) nested loops | ✅ Works. Could use HashMap for O(n) |
| 11 | Container With Most Water | Medium | Two Pointer | ✅ Clean two-pointer implementation |
| 14 | Longest Common Prefix | Easy | Sort + Compare first/last | ✅ Smart approach using sort |
| 26 | Remove Duplicates from Sorted Array | Easy | Two Pointer (in-place) | ✅ Good in-place technique |
| 27 | Remove Element | Easy | Two Pointer / Iteration | ✅ Correct |
| 33 | Search in Rotated Sorted Array | Medium | Modified Binary Search | ✅ Excellent — handles both halves correctly |
| 34 | First and Last Position in Sorted Array | Medium | Two Binary Searches (left + right bound) | ✅ Very good — two-pass binary search |
| 35 | Search Insert Position | Easy | Binary Search | ✅ Standard binary search |
| 53 | Maximum Subarray | Medium | Kadane's Algorithm | ✅ Perfect Kadane's implementation |
| 58 | Length of Last Word | Easy | Reverse iteration | ✅ Clean |
| 69 | Sqrt(x) | Easy | Binary Search | ✅ Good binary search approach |
| 73 | Set Matrix Zeroes | Medium | Marking + Two-pass | ✅ Correct approach |
| 74 | Search a 2D Matrix | Medium | Binary Search (flattened) | ✅ Good |
| 75 | Sort Colors | Medium | Counting Sort (count 0s, 1s, 2s) | ✅ Works. Dutch National Flag would be O(1) pass |
| 81 | Search in Rotated Sorted Array II | Medium | Modified Binary Search | ✅ Handles duplicates |
| 88 | Merge Sorted Array | Easy | In-place merge | ✅ Correct |
| 122 | Best Time to Buy and Sell Stock II | Medium | Greedy (sum all positive diffs) | ✅ Clean greedy |
| 125 | Valid Palindrome | Easy | Two Pointer | ✅ Good |
| 136 | Single Number | Easy | XOR Bit Manipulation | ✅ Optimal O(n) XOR — great! |
| 151 | Reverse Words in a String | Medium | StringBuilder + Reverse insert | ✅ Creative approach |
| 153 | Find Minimum in Rotated Sorted Array | Medium | Binary Search | ✅ Correct |
| 162 | Find Peak Element | Medium | Binary Search | ✅ Good edge case handling |
| 167 | Two Sum II (Sorted) | Medium | Two Pointer | ✅ Clean two-pointer |
| 169 | Majority Element | Easy | Brute Force O(n²) | ✅ Works. Boyer-Moore would be O(n) |
| 189 | Rotate Array | Medium | Extra array copy | ✅ Works |
| 189_opt | Rotate Array (Optimized) | Medium | Reverse approach | ✅ Better — O(1) space |
| 209 | Minimum Size Subarray Sum | Medium | Sliding Window | ✅ Correct sliding window |
| 217 | Contains Duplicate | Easy | Sort + Linear scan | ✅ Works. HashSet would be simpler |
| 219 | Contains Duplicate II | Easy | Sort + Nested loop with break | ⚠️ Sort breaks original indices — logic flaw |
| 229 | Majority Element II | Medium | Brute Force counting | ⚠️ Has `break` that exits after first match — misses multiple results |
| 242 | Valid Anagram | Easy | Sort + Arrays.equals | ✅ Correct |
| 268 | Missing Number | Easy | Math (sum formula) | ✅ Good |
| 283 | Move Zeroes | Easy | Two Pointer (in-place) | ✅ Clean |
| 344 | Reverse String | Easy | Two Pointer swap | ✅ Correct |
| 347 | Top K Frequent Elements | Medium | HashMap + Priority Queue concept | ✅ Works |
| 349 | Intersection of Two Arrays | Easy | Nested loops + marking | ✅ Works |
| 350 | Intersection of Two Arrays II | Easy | Sorting + Two Pointer | ✅ Good |
| 367 | Valid Perfect Square | Easy | Binary Search | ✅ Correct |
| 374 | Guess Number Higher or Lower | Easy | Binary Search | ✅ Standard |
| 383 | Ransom Note | Easy | Character counting (array) | ✅ Good approach |
| 389 | Find the Difference | Easy | XOR or counting | ✅ Clean |
| 392 | Is Subsequence | Easy | Two Pointer | ✅ Correct |
| 414 | Third Maximum Number | Easy | Track top 3 with conditionals | ✅ Detailed handling |
| 441 | Arranging Coins | Easy | Math / Binary Search | ✅ Clean |
| 455 | Assign Cookies | Easy | Greedy (sort + two pointer) | ✅ Good greedy |
| 461 | Hamming Distance | Easy | XOR + count bits | ✅ Good bit manipulation |
| 463 | Island Perimeter | Easy | Grid traversal + neighbor check | ✅ Correct |
| 476 | Number Complement | Easy | Bit mask + XOR | ✅ Good bitwise logic |
| 485 | Max Consecutive Ones | Easy | Linear scan with counter | ✅ Clean |
| 496 | Next Greater Element I | Easy | Nested loops (brute force) | ✅ Works. Stack approach better |
| 506 | Relative Ranks | Easy | Sort + Assign labels | ✅ Correct |
| 560 | Subarray Sum Equals K | Medium | Brute Force O(n²) prefix sum | ✅ Works. HashMap prefix-sum O(n) |
| 628 | Maximum Product of Three Numbers | Easy | Sort + compare ends | ✅ Good edge case handling |
| 643 | Maximum Average Subarray I | Easy | Sliding Window | ✅ Clean sliding window |
| 657 | Robot Return to Origin | Easy | Character counting | ✅ Clean |
| 704 | Binary Search | Easy | Standard Binary Search | ✅ Textbook implementation |
| 724 | Find Pivot Index | Easy | Prefix sum | ✅ Correct |
| 796 | Rotate String | Easy | String concatenation check | ✅ Smart approach |
| 832 | Flipping an Image | Easy | Reverse + Flip | ✅ Correct |
| 852 | Peak Index in Mountain Array | Medium | Binary Search | ✅ Good |
| 875 | Koko Eating Bananas | Medium | Binary Search on answer | ✅ Advanced — well done |
| 881 | Boats to Save People | Medium | Two Pointer (greedy) | ✅ Correct |
| 961 | N-Repeated Element | Easy | Frequency counting | ✅ Clean |
| 977 | Squares of a Sorted Array | Easy | Square + Sort | ✅ Works |
| 1051 | Height Checker | Easy | Selection Sort + Compare | ✅ Custom sort implementation |
| 1108 | Defanging an IP Address | Easy | String replace | ✅ Simple and correct |
| 1200 | Minimum Absolute Difference | Easy | Sort + Linear scan | ✅ Good |
| 1295 | Find Numbers with Even Digits | Easy | Digit counting | ✅ Clean |
| 1299 | Replace with Greatest on Right | Easy | Right-to-left scan | ✅ Correct |
| 1304 | Find N Unique Integers Sum to Zero | Easy | Symmetric pairs | ✅ Good |
| 1343 | Subarrays Size K Avg ≥ Threshold | Medium | Sliding Window | ✅ Good |
| 1346 | Check If N and Double Exist | Easy | Nested loop | ✅ Works |
| 1351 | Count Negatives in Matrix | Easy | Linear scan | ✅ Correct |
| 1365 | How Many Smaller Than Current | Easy | Nested loops | ✅ Works |
| 1389 | Create Target Array | Easy | ArrayList.add(index, val) | ✅ Smart |
| 1394 | Find Lucky Integer | Easy | Brute force frequency | ✅ Works |
| 1431 | Kids With Greatest Candies | Easy | Find max + compare | ✅ Clean |
| 1456 | Max Vowels in Substring Size K | Medium | Sliding Window | ✅ Good |
| 1464 | Max Product Two Elements | Easy | Brute force O(n²) | ✅ Works |
| 1470a | Shuffle the Array | Easy | Two pointer interleave | ✅ Clean |
| 1470b | Shuffle the Array (v2) | Easy | Scanner + manual split | ⚠️ Logic error in merge |
| 1480 | Running Sum of 1D Array | Easy | In-place prefix sum | ✅ Clean |
| 1482 | Min Days for m Bouquets | Medium | Binary Search on answer | ✅ Excellent |
| 1491 | Avg Salary Excl Min Max | Easy | Find min/max, subtract | ✅ Correct |
| 1502 | Can Make Arithmetic Progression | Easy | Sort + check diffs | ✅ Good |
| 1512 | Number of Good Pairs | Easy | Brute Force O(n²) | ✅ Works |
| 1528 | Shuffle String | Easy | Index-based placement | ✅ Clean |
| 1539 | Kth Missing Positive Number | Easy | Binary Search / Linear | ✅ Correct |
| 1572 | Matrix Diagonal Sum | Easy | Loop with index math | ✅ Clean |
| 1608 | Special Array | Easy | Sort + count | ✅ Works |
| 1614 | Max Nesting Depth Parentheses | Easy | Counter tracking | ✅ Clean |
| 1662 | Check Two String Arrays Equal | Easy | Concatenation + equals | ✅ Simple |
| 1672 | Richest Customer Wealth | Easy | Nested loop sum | ✅ Correct |
| 1678 | Goal Parser Interpretation | Easy | StringBuilder traversal | ✅ Clean |
| 1704 | String Halves Are Alike | Easy | Vowel counting per half | ✅ Good |
| 1768 | Merge Strings Alternately | Easy | Two pointer interleave | ✅ Clean |
| 1876 | Substrings Size 3 No Repeats | Easy | Sliding window + check | ✅ Good |
| 1903 | Largest Odd Number in String | Easy | Right-to-left scan | ✅ Optimal |
| 1920 | Build Array from Permutation | Easy | Direct index mapping | ✅ Clean |
| 1929 | Concatenation of Array | Easy | Copy to doubled array | ✅ Correct |
| 1967 | Strings as Substrings | Easy | Contains check | ✅ Clean |
| 1991 | Find Middle Index | Easy | Prefix sum / pivot | ✅ Correct |
| 2000 | Reverse Prefix of Word | Easy | Find char + reverse | ✅ Good |
| 2379 | Min Recolors for K Black | Medium | Sliding Window | ✅ Clean |
| 2419 | Rearrange Array by Sign | Medium | Separate + interleave | ✅ Works |
| 2491 | Divide Players Equal Skill | Medium | Sort + Two Pointer | ✅ Good |
| 2529 | Max Count Pos/Neg Integer | Easy | Linear count | ✅ Simple |
| 2570 | Merge Two 2D Arrays | Medium | Two Pointer merge | ✅ Good |
| 2678 | Number of Senior Citizens | Easy | String parsing | ✅ Correct |
| 2839 | Check Strings Made Equal | Easy | Char comparison | ✅ Works |
| 2942 | Find Words Containing Char | Easy | Linear scan | ✅ Simple |
| 3074 | Apple Redistribution | Easy | Greedy sort | ✅ Good |
| 3110 | Score of a String | Easy | Adjacent diff sum | ✅ Clean |
| 3442 | Max Diff Even Odd Freq | Medium | Frequency counting | ✅ Works |
| 3880 | New problem | — | Sliding window / string | ✅ Good |
| 3884 | New problem | — | Simple logic | ✅ Clean |

### SOLVED/ Root (10 files)

| # | Problem | Approach | Notes |
|---|---------|----------|-------|
| 28 | Find Index of First Occurrence (+P680) | String matching pointer | ✅ + includes P680 Valid Palindrome II |
| 287 | Find the Duplicate Number | Binary Search on value range | ✅ Clever counting binary search |
| 412 | Fizz Buzz | Modulo conditionals | ✅ Textbook |
| 693 | Binary Number Alternating Bits | Bitwise adjacent check | ✅ Good bit manipulation |
| 948 | Bag of Tokens | Sort + Two Pointer greedy | ✅ Clean greedy |
| 1089 | Duplicate Zeros | Shift-right approach | ✅ In-place shifting |
| 2108 | Find First Palindromic String | Two pointer palindrome | ✅ Correct |
| 2149 | Rearrange Array by Sign | Separate pos/neg + interleave | ✅ Clean |
| 2410 | Max Matching Players/Trainers | Sort + Two Pointer | ✅ Good greedy |
| 2486 | Append Chars for Subsequence | Two Pointer subsequence | ✅ Correct |

---

## 🔴 UNSOLVED QUESTIONS (28 + 10 Root WIP)

### UNSOLVED/leetcode/ (37 files)

| # | Problem | Diff | Status | What Went Wrong |
|---|---------|------|--------|----------------|
| 20 | Valid Parentheses | Easy | ❌ Wrong | Uses counters not Stack — fails `"([)]"` |
| 34 | First/Last Position | Med | ❌ Dup | Incomplete duplicate attempt |
| 42 | Trapping Rain Water | Hard | ❌ Incomplete | Doesn't track left/right maxima |
| 43 | Multiply Strings | Med | ❌ Empty | No logic written |
| 48 | Rotate Image | Med | ❌ Half | Transpose works, row reverse empty |
| 66 | Plus One | Easy | ❌ Broken | ArrayIndexOutOfBounds on {9,9} |
| 69 | Sqrt(x) | Easy | ⚠️ Near | mid*mid overflow for large x |
| 121 | Buy and Sell Stock | Easy | ⚠️ Correct! | Should be moved to SOLVED |
| 152 | Max Product Subarray | Med | ❌ Wrong | Brute force misses neg×neg. Needs DP |
| 198 | House Robber | Med | ❌ Wrong | Odd/even sum doesn't work. Needs DP |
| 209 | Min Size Subarray | Med | ⚠️ Dup | Different attempt |
| 219 | Contains Duplicate II opt | Easy | ⚠️ Incomplete | Optimization unfinished |
| 287 | Find Duplicate | Med | ❌ Incomplete | Binary search not finished |
| 367 | Perfect Square opt | Easy | ⚠️ Incomplete | Alternative approach |
| 448 | Disappeared Numbers | Easy | ❌ Incomplete | Logic not complete |
| 540 | Single Element Sorted | Med | ⚠️ Near | Wrong termination return |
| 541 | Reverse String II | Easy | ❌ Broken | Overly complex approach |
| 605 | Can Place Flowers | Easy | ⚠️ Near | `n == count` should be `n <= count` |
| 680 | Valid Palindrome II | Med | ❌ Commented | All code commented out |
| 704 | Binary Search | Easy | ❌ Empty | Method body empty |
| 867 | Transpose Matrix | Easy | ❌ Incomplete | Swap logic commented out |
| 912 | Sort an Array | Med | ❌ Empty | No implementation |
| 925 | Long Pressed Name | Easy | ❌ Bug | Double increment of i |
| 1021 | Remove Outer Parentheses | Easy | ❌ | Needs review |
| 1189 | Max Balloons | Easy | ❌ | Needs review |
| 1217 | Min Cost Move Chips | Easy | ❌ Stub | Minimal code |
| 1331 | Rank Transform | Easy | ❌ | Needs review |
| 1380 | Lucky Numbers Matrix | Easy | ❌ | Needs review |
| 1408 | String Matching Array | Easy | ❌ Stub | Minimal code |
| 1636 | Sort by Frequency | Easy | ❌ Inf loop | `i = j` causes infinite loop |
| 1668 | Max Repeating Substring | Easy | ❌ Wrong | Pointer issues |
| 1732 | Highest Altitude | Easy | ❌ | Needs review |
| 1752 | Sorted and Rotated | Easy | ❌ | Named as unsolved |
| 1773 | Count Items Rule | Easy | ❌ | Needs review |
| 1859 | Sorting Sentence | Easy | ❌ | Needs review |
| 1903 | Largest Odd (dup) | Easy | ⚠️ Dup | Different attempt |
| 1984 | Min Diff K Scores | Easy | ❌ | Needs review |
| 826 | Most Profit Work | Med | ❌ Wrong | Flawed brute force matching |

### Root-level src/ WIP (10 files)

| # | Problem | Status | Notes |
|---|---------|--------|-------|
| 78 | Subsets | ❌ Commented | Bit manipulation abandoned |
| 238 | Product Except Self | ⚠️ Partial | Division approach, zeros broken |
| 442 | Find All Duplicates | ✅ Works! | Move to SOLVED |
| 645 | Set Mismatch | ⚠️ Wrong | Code does bit complement not actual problem |
| 825 | Friends of Appropriate Ages | ❌ Wrong | Conditions inverted |
| 838 | Push Dominoes | ❌ Partial | Some cases break |
| 881 | Boats (v2) | ❌ Empty | While loop has no logic |
| 977 | Squares Sorted (opt) | ❌ Incomplete | Only squares, no merge |
| 2037 | Min Moves to Seat | ✅ Works! | Move to SOLVED |
| 2337 | Move Pieces | ❌ Commented | Abandoned |
| 2594 | Min Time Repair Cars | ❌ Incomplete | No binary search yet |

---

## 🏆 CONTEST QUESTIONS (6 files)

| Contest | Q | Status | Approach |
|---------|---|--------|----------|
| Biweekly 172 Q2 | Max Sum Div 3 | ⚠️ O(n³) | Triple nested loop — will TLE |
| Biweekly 172 BS Q1 | Binary Search practice | ❌ Bug | Missing mid recalc, infinite loop |
| Biweekly 173 Q1 | Reverse K chars | ✅ | StringBuilder reverse — clean |
| Weekly 488 Q1 | Count Dominant | ✅ | Nested loop O(n²) — correct |
| Weekly 490 Q1 | Player Score Diff | ⚠️ | XOR toggle — uncertain logic |
| Weekly 492 Q1 | Min Index ≥ Target | ✅ | Linear scan — correct |

---

## 📈 TOPIC-WISE BREAKDOWN

| Topic | Solved | Unsolved | Total |
|-------|--------|----------|-------|
| **Arrays (Basic)** | 45 | 8 | 53 |
| **Binary Search** | 15 | 4 | 19 |
| **Two Pointer** | 18 | 3 | 21 |
| **Sliding Window** | 8 | 1 | 9 |
| **Strings** | 16 | 5 | 21 |
| **Bit Manipulation** | 6 | 1 | 7 |
| **Sorting** | 8 | 2 | 10 |
| **Greedy** | 6 | 0 | 6 |
| **Math** | 5 | 1 | 6 |
| **Matrix** | 5 | 3 | 8 |
| **Dynamic Programming** | 0 | 3 | 3 |
| **Stack** | 0 | 1 | 1 |
| **HashMap/HashSet** | 2 | 2 | 4 |

---

## 💪 STRENGTHS

1. **Binary Search** — Solved advanced problems: 875 (Koko Bananas), 1482 (Bouquets), 33 (Rotated Array), 34 (First/Last Position). You understand binary search on answer space
2. **Two Pointer** — Excellent grasp: 167, 26, 27, 283, 881, 948 all clean
3. **Sliding Window** — Consistent correct implementations: 643, 1343, 1456, 2379, 209, 1876
4. **Bit Manipulation** — Naturally reach for XOR (136, 461, 476, 693). Solid
5. **Greedy** — 122, 455, 948, 2410 show good greedy intuition
6. **Volume** — 127+ solved problems is solid work

---

## ⚠️ WEAKNESSES & GAPS

1. **Dynamic Programming** — Zero DP solved. 198, 152, 42 all needed DP and you struggled
2. **Stack** — Problem 20 used counters instead of Stack. Learn Stack-based approaches
3. **HashMap optimization** — Many O(n²) solutions (1, 169, 217, 560) could be O(n) with HashMap
4. **Over-reliance on Brute Force** — ~30% of solved use O(n²) where better exists
5. **Integer Overflow** — Problem 69 fails because mid*mid overflows int. Use long
6. **Edge Cases** — Problem 66 crashes on {9,9}, Problem 229 breaks early

---

## 🎯 RECOMMENDED NEXT STEPS

### Priority 1: Fix Misplaced Files
- **Move to SOLVED**: Problem 121, 442, 2037 (these work correctly)
- **Move to UNSOLVED**: Problem 219 (sort breaks original indices)

### Priority 2: Learn Dynamic Programming
1. 70 — Climbing Stairs (1D DP intro)
2. 198 — House Robber (you already attempted)
3. 152 — Maximum Product Subarray
4. 322 — Coin Change
5. 300 — Longest Increasing Subsequence

### Priority 3: Learn Stack
1. 20 — Valid Parentheses (redo with Stack)
2. 155 — Min Stack
3. 739 — Daily Temperatures

### Priority 4: Use HashMap More
Re-solve these with HashMap for O(n):
- Problem 1 (Two Sum), 169 (Majority), 217 (Duplicate), 560 (Subarray Sum K)

### Priority 5: Complete Easy Unsolved
Quick wins: 66, 448, 1189, 1732, 1773, 1859

---

## 🔥 CODING PATTERNS OBSERVED

1. **Naming**: You consistently name methods `logic()` — use descriptive names like `findTarget()`, `maxProfit()`
2. **Testing**: Hardcoded test cases in main() — consider multiple test cases
3. **Code Style**: Spaces before semicolons (`int i = 0 ;`) — non-standard but works
4. **Comments**: Very few — adding algorithm notes helps review later
5. **Data Structures**: Heavily favor arrays/ArrayList. Branch into HashMap, HashSet, Stack, Queue

---

> **Overall**: Strong foundation in arrays, binary search, two pointers, sliding window. Next level-up requires mastering DP, Stack, and HashMap optimizations. Keep grinding! 🚀
