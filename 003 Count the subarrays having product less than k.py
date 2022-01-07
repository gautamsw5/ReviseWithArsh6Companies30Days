class Solution:
    def countSubArrayProductLessThanK(self, arr, n, k):
        l, r, p = 0, 0, 1
        ans = 0
        while l < n:
            while r < n and p*arr[r] < k:
                p = p*arr[r]
                r += 1
                ans += r - l
            p = p // arr[l]
            l += 1
            if l > r:
                r = l
                p = 1
        return ans
