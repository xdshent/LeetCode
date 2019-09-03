package com.github.xdshent.leetcode.string;

/**
 * 1108. Defanging an IP Address
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 * A defanged IP address replaces every period "." with "[.]".
 * <p>
 * Example 1:
 * Input: address = "1.1.1.1"
 * Output: "1[.]1[.]1[.]1"
 * <p>
 * Example 2:
 * Input: address = "255.100.50.0"
 * Output: "255[.]100[.]50[.]0"
 * <p>
 * Constraints:
 * The given address is a valid IPv4 address.
 *
 * @author xdshen
 */
public class DefangingAnIPAddressSolution {

    /**
     * Time Complexity: O(L)
     * Space Complexity: O(1)
     *
     * @param address
     * @return
     */
    public String defangIPAddr(String address) {
        if (address == null || address.length() == 0) {

            return "";
        }

        int len = address.length();
        for (int i = 0; i < len; i++) {
            if (address.charAt(i) == '.') {

                address = address.substring(0, i) + "[.]" + address.substring(++i, len);
                len += 2;
            }
        }

        return address;
    }
}
