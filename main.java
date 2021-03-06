//原题给的array一定不会出现1靠着1
//所以可以跳两个，跳三写的非常巧妙
//当然也可以暴力，贪心


class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int index = 0;
        while (index < flowerbed.length) {
            if (flowerbed[index] == 0) {
                if (index == flowerbed.length - 1 || flowerbed[index + 1] == 0) {
                    // 可种，种一朵，跳到下一个有可能可以种的地方，步进2
                    n--;
                    index += 2;
                } else {
                    // 不可种，当前位置下一个位置为1，则下一个有可能可以种的地方需要步进3
                    index += 3;
                }
            } else {
                // 不可种，当前位置为1，则下一个有可能可以种的地方需要步进2
                index += 2;
            }
        }
        return n <= 0;
    }
}
