# Others

- O for passing during the contest
- Ø for passing after the contest
- ! for attempted but failed
- · for having not attempted yet



| Name                                                         | Date     | Rank                               | Solved | 1A   | 2B   | 3C   | 4D   | 5E   | 6F   | 7G   | 8H   | 9I   | 10J  | 11K  | 12L  | 13M  | 14N  |
| ------------------------------------------------------------ | -------- | ---------------------------------- | ------ | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- |
| [NCPC 2020](https://vjudge.net/contest/462676#rank)          | 21-10-16 | 3/（现场                           | 11/13  | O    | O    | O    | O    | O    | O    | O    |      | O    | O    | O    |      | O    |      |
| [SEERC 2020](https://codeforces.com/gym/103102)              | 21-10-27 | 40/133（现场                       | 5/13   |      | O    |      |      | O    |      |      |      | O    |      |      | O    | O    |      |
| [SWERC 2020](https://codeforces.com/gym/103081)              | 21-11-1  | 校2/4（1268                        | 8/13   | O    |      | O    | O    | O    | O    | !    | O    | O    |      | O    |      |      |      |
| [SEERC 2019](https://codeforces.com/gym/102392)              | 21-11-10 | 6/90（现场                         | 7/11   |      | O    |      | O    | O    | O    | O    |      | O    | O    |      |      |      |      |
| [SEERC 2021](https://codeforces.com/gym/103438)              | 22-2-7   | 16/116(现场)-2/5(校内8(11)(12)(13) | 7/14   | O    | ·    | !    | ·    | ·    | O    | O    | ·    | ·    | O    | O    | O    | ·    | O    |
| [Latin American ICPC  2020-2021](https://codeforces.com/gym/103185) | 22-2-9   |                                    | 8/14   | ·    | Ø    | O    | O    | O    | ·    | ·    | O    | ·    | O    | O    | O    | ·    | O    |
| [Latin American ICPC  2019-2020](https://codeforces.com/gym/102428) | 22-2-11  |                                    | 8/13   | !    | ·    | Ø    | O    | O    | O    | O    | ·    | O    | ·    | O    | O    | O    | ·    |
| [SWERC 2018](https://codeforces.com/gym/102465)              | 22-2-13  |                                    | 11/11  | O    | O    | O    | O    | O    | O    | O    | O    | O    | O    | O    |      |      |      |
| [NEERC 2017](https://codeforces.com/gym/101630)              | 22-2-15  |                                    | 7/12   | O    | O    | O    | O    | O    | O    | ·    | ·    | Ø    | ·    | ·    | O    |      |      |
| [Asia Tsukuba Regional Contest](https://codeforces.com/gym/101158) | 22-2-20  | 校排2                              | 7/11   | O    | O    | O    | O    | O    | O    | O    |      |      |      |      |      |      |      |
| [2021-2022 Russia Team Open, High School Programming Contest (VKOSHP XXII)](https://codeforces.com/gym/103483) | 22-2-25  |                                    | 8/12   | O    | ·    | ·    | O    | O    | O    | O    | O    | O    | ·    | O    | !    |      |      |



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







## SWERC2020


H ： 读错题 

前期挺顺的，后期节奏有点乱（读错H的输入格式之后查了非常久，就乱了

G 有思路没时间写



## SEERC 2019

卡签到

输入输出2e6 $\rightarrow$ scanf

数据范围，边界问题

长样例用clion对比



## Latin American ICPC 2019-2020

A题似乎是hash出问题了（下次尽量双hash

​	在表示“算法”的时候可以考虑直接转longlong（27进制）

​	随机溢出过了

几何题能用longlong就尽量别用double



## SWERC 2018

几发wa : 

B 判断条件写错

D debug没有注释

E 少一个条件

F 向量加减的时候顺序，答案没有取绝对值

G l[x] 写成l[0]

## 2016-2017 ACM-ICPC, Asia Tsukuba Regional Contest

> “模拟害人”