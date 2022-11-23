package com.revature.problem2;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> abracadabra(int n) {
        /* You can comment or delete this line of code */
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 1; i < n+1; i++)
        {
            if (i % 3 == 0 && i % 5 == 0)
            {
                strings.add("abracadabra");
            }
            else if (i % 3 == 0)
            {
                strings.add("abraca");
            }
            else if (i % 5 == 0)
            {
                strings.add("dabra");
            }
            else
            {
                strings.add(""+i+"");
            }
        }
        return strings;
    }
}
