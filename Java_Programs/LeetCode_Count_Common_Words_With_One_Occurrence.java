
// 2085. Count Common Words With One Occurrence : https://leetcode.com/problems/count-common-words-with-one-occurrence/
import java.util.*;

public class LeetCode_Count_Common_Words_With_One_Occurrence {

    static int countWords(String[] words1, String[] words2) {
        HashMap<String, Integer> maps = new HashMap<>();
        HashMap<String, Integer> maps1 = new HashMap<>();
        int count1 = 0;
        for (String element : words1) {
            if (maps.containsKey(element)) {
                maps.put(element, maps.get(element) + 1);
                count1++;
            } else {
                maps.put(element, 1);
            }
        }
        count1 = words1.length - count1;
        System.out.println(count1);
        for (String element : words2) {
            if (maps1.containsKey(element)) {
                maps1.put(element, maps1.get(element) + 1);
            } else {
                maps1.put(element, 1);
            }
        }
        int count = 0;
        for (String key1 : maps.keySet()) {
            for (String key2 : maps1.keySet()) {
                if (key1.equals(key2) && (maps.get(key1) == 1 && maps1.get(key2) == 1))
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] words1 = { "a", "ab" };
        String[] words2 = { "a", "a", "a", "ab" };
        // String[] words1 = { "b", "bb", "bbb" };
        // String[] words2 = { "a", "aa", "aaa" };
        // String[] words1 = { "leetcode", "is", "amazing", "as", "is" };
        // String[] words2 = { "amazing", "leetcode", "is" };
        // String[] words1 = { "bjxzvssdoq", "oom", "lxrrvf", "aoeselhvrnw",
        // "awnornqyztqlza", "bjxqkapuvaw",
        // "wibxruerngdzgjd", "rezrwdzvllpbjpnikhzraz", "pswmnrsepudx", "nlicjldpeia",
        // "glg", "nllxfcjjitmsuugmr",
        // "cl", "pysmpgjakkjnusfopphb", "zxlwcdjpn", "xktsfnchwrdesnf",
        // "qptnoxxgrjmvr",
        // "exlfwjfsbsirbbkyqjtinrrwuhh", "rqbnghajxygilgdjejopyuwyjqrx",
        // "vrjkqsicuqoalqyaxkaaogxbf",
        // "ixnlltqbpygmpjuspom", "izajsxotcbhzdnkujwgdzo", "b", "lighabre", "i",
        // "ljqqbfddipvcooh",
        // "hboedpepeeunx", "bkhzhiefammwqkhvampokd", "ptlozguwmyyp", "loeshsjgazzwvs",
        // "kyrltbdzlymjxtvwiiq",
        // "fk", "mbjpgwsahkgkehlcoqbhunqchxj", "nfyuvlrmiturheb", "cyqwsiysmoirurj",
        // "sciqruywy", "podsrhmsozan",
        // "nlyadkrxhdbup", "gdugldwghzt", "wpjm", "gjobdekmjisjgadkwwemnmco",
        // "dkjdtimdghvlhuetxyaklk",
        // "iwqylhdwqbwaqdouowoodhs", "mn" };
        // String[] words2 = { "eeormvovhzslwsqgzthlgntgzc", "zfwownznh",
        // "suxrkdbjdjjtbkjucsbyk", "u", "y",
        // "lbjooktoctgwbbptiffytquha", "dcsxrghgpultkatbecjadbespvww", "vwduylshcpaiu",
        // "rtcxwctvquaiuwkgvdx",
        // "a", "szearxmdqcismljmihbtkcirztdnrc", "htgmuxtxdunsvfizb", "hybe",
        // "nsegkgwcvopncmfpaahhhjeuqjosv",
        // "jtarnnpppxtzmopixeijqqahkd", "hazcgrrnpourkyoeanodejiptne", "kurhokvhixihe",
        // "ljwycewmecfqdhtxiokjn",
        // "qgjzzvpyvwetlsvcsw", "aunns", "nwcnfrzzvxafkfjfnczummtubikji",
        // "nipiygnvlfntgpxfedj", "mgnt",
        // "xvjehufvaqouhztnmts", "sjtbrfjwtqxakqktxjaljrbwfoxvz",
        // "dfeujeikfrtrpiafrgxvjlkpxtog", "u",
        // "ggbcxoasodaqaazulrxjleecexey", "inedrgssajhpygfvozigohis",
        // "pevxwgfzxebybfe", "cgy", "fnhvlx",
        // "vxfybaebkoq", "xvhx", "mxbqjtanctljewwjjlbpkgbtsm",
        // "mlwagamcikbcpuexhikmizp",
        // "qeiomipvsoqlsnhylulirrcwtqga", "bwemqcgyusuauwlpbjjru", "iimcbidtndh",
        // "lpjejlkmxtlbyvnscy",
        // "dlspriicnyykdsyvswlgktavwloq", "dib", "qoptbduulgqwquvhdvmwdz",
        // "xrtxghrbfrhpzduxeljnctgg",
        // "schmbsaupayqnpchn", "kah", "itotymryqufqpozrwmvsl", "gurb",
        // "xsyocxcmwvqmnmxthfemmu", "pkfdutm",
        // "hkbwxwjxyuld", "ukdqszfjckdunnhpevw", "kqfwytdvnvjrchiwprcqkfntqticsc",
        // "zjmsfwjddgjiypsmagdrujb",
        // "gn", "ebncbjvhpbjecbrizdpv", "nbfehcktwswih",
        // "sttmqcdmobdgtgkyxydyovahknjbsn", "sryyufrtocf",
        // "eiicpwknxrzqylqpybhfd", "pey", "njimttradeoa", "wcogjdfr", "prva",
        // "tyxdmxgw", "wluzocppg", "kzm",
        // "wbyyperlkflaoxyxftzwxvmemof", "snzpclbulddnmmjmpdurcybo",
        // "mowxgpmzojtmympmt", "uvtnojjahrovzmlukf",
        // "sykhtgejlmbzshhneoyqr", "ib", "haqkkizidifykwijm", "csjtexnr", "yvgr",
        // "vzcxbtlthrynnawxnkxdptp",
        // "yvxrmscsckv" };
        int ans = countWords(words1, words2);
        System.out.println(ans);
    }
}

// Output
// Input: words1 = ["leetcode","is","amazing","as","is"], words2 =
// ["amazing","leetcode","is"]
// Output: 2
// Explanation:
// - "leetcode" appears exactly once in each of the two arrays. We count this
// string.
// - "amazing" appears exactly once in each of the two arrays. We count this
// string.
// - "is" appears in each of the two arrays, but there are 2 occurrences of it
// in words1. We do not count this string.
// - "as" appears once in words1, but does not appear in words2. We do not count
// this string.
// Thus, there are 2 strings that appear exactly once in each of the two arrays.

// Input: words1 = ["b","bb","bbb"], words2 = ["a","aa","aaa"]
// Output: 0
// Explanation: There are no strings that appear in each of the two arrays.

// Input: words1 = ["a","ab"], words2 = ["a","a","a","ab"]
// Output: 1
// Explanation: The only string that appears exactly once in each of the two
// arrays is "ab".

// Explanation : Given two string arrays words1 and words2, return the number of
// strings that appear exactly once in each of the two arrays.