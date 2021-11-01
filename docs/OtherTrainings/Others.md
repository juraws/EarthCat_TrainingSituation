# Others

- O for passing during the contest
- Ø for passing after the contest
- ! for attempted but failed
- · for having not attempted yet



| Name                                                | Date     | Rank         | Solved | 1A   | 2B   | 3C   | 4D   | 5E   | 6F   | 7G   | 8H   | 9I   | 10J  | 11K  | 12L  | 13M  |
| --------------------------------------------------- | -------- | ------------ | ------ | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- |
| [NCPC 2020](https://vjudge.net/contest/462676#rank) | 21-10-16 | 3/（现场     | 11/13  | O    | O    | O    | O    | O    | O    | O    |      | O    | O    | O    |      | O    |
| [SEERC 2020](https://codeforces.com/gym/103102)     | 21-10-27 | 40/133（现场 | 5/13   |      |      |      |      |      |      |      |      |      |      |      |      |      |



## NCPC 2020

A：少情况

C：边界处理

D：逻辑

J：sort

F：少判一个

I：全wa在调参





## SEERC 2020

> "DP场"



**F - Fence Job  (DP**

考虑从合法的结果入手而不是操作，因为不同的操可能得到相同的结果。对于一个 hi，它可以通过操作“扩展”，从而对区间 $[l,r]$赋值，其中 $[l,r]$ 是极长的包含 i 的，满足最小值为$ h_i$ 的区间。

动态规划，定义 $f(i,j)$ 为只使用 $h_{1∼i}$，构造一个长度为 j 的结果序列的方案数。考虑从 $f(i,⋅)$ 转移到 $f(i+1,⋅)$ 设 $[l,r]$ 为其极大拓展区间，那么写出转移：

$∀j∈[l,r],f(i+1,j)=∑_{k=l−1}^jf(i,k)$

通过显然的前缀和优化，这个式子已经可以$O(n^2)$ 算出了。实现时可以将第一维滚掉。

**D - Disk Sort ( 模拟**

思路差不多没时间写