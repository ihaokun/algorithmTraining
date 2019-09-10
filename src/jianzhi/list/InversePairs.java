package jianzhi.list;

/**
 * <pre>
 *     剑指offer - 数组中的<em>逆序对</em>
 *     对：即为双、二
 *
 *      考点：
 *          时间、空间效率的平衡
 *      知识点：
 *          数组、排序算法（Merge Sort（分治策略divide-and-conquer））
 *
 *     题目描述：
 *          在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 *          输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
 *          （数组中元素无重复）
 *
 *      三种解法：
 *          解法一穷举；解法二不太好，是自己想的，思路比较歪；第三种解法好一点
 *          这题和 Merge Sort 关联很大，可以参考一下{@link algorithms.chapter2_sorting.MergeSort}
 *
 * </pre>
 *
 * @author ihaokun
 * @date 2019/9/5 22:44
 * @see <a href="https://baike.baidu.com/item/%E9%80%86%E5%BA%8F%E5%AF%B9/11035554">逆序对baike</a>
 * @see <a href="https://zh.wikipedia.org/wiki/%E9%80%86%E5%BA%8F%E5%AF%B9">逆序对wiki</a>
 */
public class InversePairs {
    public static void main(String[] args) {
        // int[] array = {7, 6, 5, 4};
        // int[] array = {1,2,3,4};
        // int[] array = {1, 2, 3, 4, 5, 6, 7, 0};
        // int[] array = {7, 5, 6, 4};
        /*int[] array = {
                364,637,341,406,747,995,234,971,571,219,993,407,416,366,315,301,601,650,418,355,460,505,360,965,516,648,727,667,465,849,455,181,486,149,588,233,144,174,557,67,746,550,474,162,268,142,463,221,882,576,604,739,288,569,256,936,275,401,497,82,935,983,583,523,697,478,147,795,380,973,958,115,773,870,259,655,446,863,735,784,3,671,433,630,425,930,64,266,235,187,284,665,874,80,45,848,38,811,267,575
        };*/
        int[] array = {
                627126,415347,850134,371085,279048,705820,453064,944751,92317,58592,167988,284065,992573,78043,190215,104546,607528,391775,701214,849731,231053,603058,975374,199773,479544,143961,206797,325662,90035,69615,429916,717161,484962,796403,604598,280362,502223,57662,741466,594540,632606,909454,394957,625180,503849,585172,729726,627729,976947,947293,477461,724352,66703,452835,440478,62599,596797,163627,388261,203184,233243,334529,436697,234557,647284,41295,514920,665859,615310,256386,776752,247916,682192,171709,389448,186041,273234,635527,813771,766533,582820,807584,490886,649523,260419,447716,228474,373568,611343,616735,576752,844586,467616,529801,595496,631253,571097,110416,297112,186407,883154,73864,950675,81698,245574,340124,267739,35160,975651,597862,801693,74823,921798,292579,240698,182218,256647,469172,72138,867991,602259,165243,228929,69875,695044,824425,701128,782493,451193,998241,485252,334347,588457,435928,416045,350383,292404,200137,385543,268055,314351,187237,859230,236150,996168,99928,934720,252816,569100,523210,120807,171359,688453,866088,757586,383498,206866,458715,682343,658059,973308,167596,508759,78117,603524,441156,428501,412280,157645,814044,196687,471997,1281,55917,224499,997450,155845,159219,250266,241297,682429,887425,412656,887235,269865,686594,787085,476731,661661,469428,134791,634969,637024,643550,229439,756900,601058,657940,169180,758704,471984,365867,230701,473266,421784,455200,470716,93981,130771,237334,335278,329552,641111,264286,733139,910976,950881,520224,904060,612542,989653,38851,763864,143029,198753,993303,899930,799811,651243,585462,558515,639579,951330,305568,112845,889466,277120,99913,499800,924243,853599,835078,770148,11062,615717,503287,922039,82950,23512,826099,695492,529517,381302,975708,672546,96407,485363,88828,896218,652958,674291,971086,292538,141973,276654,921735,547791,70127,21649,47591,994370,391600,399022,764518,402663,14739,267806,841054,97689,807670,183505,309533,337187,564807,801594,9733,661214,803309,614914,73784,456268,805557,44870,265158,947530,837877,703245,11673,908004,241246,59265,418726,632847,974639,183245,35510,505730,967403,392916,603419,775073,576421,429304,112260,141228,747250,638345,318794,550560,769611,392578,523180,575168,953801,304690,39050,308030,7935,50724,216034,249182,626341,151112,882029,600980,334357,433891,106710,818112,826807,226481,593185,919580,172137,221797,60808,919388,376495,895954,986300,146106,804884,509480,237627,275037,814170,276677,583067,338457,327401,315453,587639,953742,466566,986020,71074,317275,936263,694136,135388,763070,920617,728573,682650,92755,466723,259810,528495,843218,672116,514795,505676,477001,24275,259655,752038,354797,536333,335106,693254,380086,166911,797246,850181,633477,783266,921255,950753,719530,615392,86141,998952,52361,331066,197955,661468,797789,974117,189963,157359,646234,704758,179388,639587,245385,439043,907977,116534,491728,759435,809789,871815,926347,123387,721996,559824,423005,159603,510577,142535,774995,113070,657840,343709,444137,372147,5177,758278,346264,195141,915638,508850,416251,611378,664789,661637,50421,572767,294523,58502,332202,620664,930317,258549,744051,652313,818374,167057,811916,845303,825944,103264,474726,483784,446973,918863,855931,968502,677141,718548,163643,109131,743750,96247,720509,408540,274236,287283,981307,568759,862137,313509,189424,792454,88411,933475,961119,423137,616884,773035,268440,442829,392651,743166,442965,839624,178381,815249,324479,371875,533797,488122,481006,793899,100721,717868,202439,374957,521503,183746,943717,383640,13608,133141,692446,618371,582968,653565,41508,716205,942952,826300,159034,335604,85819,118351,691580,780552,933600,16059,152427,983749,20534,149786,777649,121255,384006,980088,496213,421861,680187,956282,321853,210147,605775,14299,828518,188743,667864,386378,904948,610816,212678,580334,462772,814849,698686,154353,595402,148638,170412,747829,132388,190946,897615,910037,828554,797973,406477,324767,219834,603016,281049,541687,813163,886824,555986,158033,591919,740202,60763,13220,867371,789794,109906,330143,604643,324944,484496,200045,473583,171261,464227,605971,878559,878194,32360,707113,676168,438837,31880,896002,41854,829281,954042,371369,232457,510028,45755,340729,766583,106518,353949,633954,896312,463855,964097,17308,788800,448594,733705,262383,619855,714284,384706,498414,592479,417066,721880,784999,855903,753760,197353,414109,99394,151395,301831,848203,177776,347586,188932,944359,970456,542881,578313,383121,523089,58762,400429,828241,507356,134134,606976,643563,848419,991682,658330,957250,408748,380210,258601,781003,650322,455954,195113,266068,123702,13296,114272,301478,360882,303204,762189,331338,846086,856854,714459,885527,915616,631240,713768,939325,281727,837096,99240,646498,828778,757570,603748,753878,654132,862349,534881,304455,834655,246346,86875,958357,259642,201147,776187,136876,504352,538376,984567,866790,911582,699026,268669,343551,846619,982437,282876,128346,819533,382116,774844,164663,656039,894944,918541,826523,273645,969774,647330,108300,732473,734206,66658,508467,935353,359197,161696,956057,413926,146263,339199,325508,361641,607868,669059,208260,106657,468287,336606,442542,366756,627802,607205,539147,522746,42098,365670,796391,528225,13001,421044,777050,747207,4054,285517,198912,363251,447213,154970,777177,593476,494169,619038,471470,102038,804449,679730,208695,272737,532689,651238,160491,774795,694992,199590,333246,60662,512333,861471,590015,933377,638521,337222,937431,440390,536135,300683,887604,691105,594212,997432,701626,213250,468902,320016,17700,664985,528712,806789,197674,696302,962634,874517,987449,173978,74107,320695,234640,102793,182166,824656,36170,337039,678230,489954,777430,214365,790637,181386,421822,901201,178818,639801,114452,164073,959817,648504,829058,4881,971645,543084,217535,934279,417601,204985,108257,8061,525680,859249,110854,224199,200257,663376,561238,878488,153330,855020,609205,460319,36406,547380,361521,731577,187181,992325,895650,146998,157181,241060,668232,128826,784144,885767,579457,718097,90752,687714,726158,132785,63315,353364,873336,263573,533093,950926,142061,686423,805947,267618,663095,842353,814998,540968,573930,518531,49645,985932,665530,206826,226992,850114,852004,527488,735881,431461,245586,342986,488096,475771,698842,357813,349107,962415,890906,300033,620828,93681,622332,404799,273128,464686,219797,814096,554968,738329,863741,540901,920211,586919,284245,770325,438923,811734,22558,870384,573672,365544,505911,578120,841315,721106,935933,706774,683521,343191,523160,820702,436873,145492,225501,710001,126530,961650,40450,681499,216331,904191,738752,136542,7463,22997,423219,446386,834731,445778,833123,924755,811322,339034,502876,168990,576492,438809,392116,260014,782001,431628,597068,735226,93473,338921,445227,220003,300571,2029,417854,516903,906221,156606,169797,430036,179604,593017,876422,530687,38795,709545,455443,366469,564932,958319,535459,141424,913480,443928,917790,211833,875556,31210,947059,969029,886483,908639,705385,187055,910668,123239,220310,333241,796198,906459,763277,492154,15828,156052,22841,570975,381949,994636,937445,463233,469307,989256,121010,899140,433184,555152,110973,308741,586363,58033,794122,472846
        };
        System.out.println(solution(array));
        System.out.println(solution1(array));
    }

    private static int divisor = 1000000007;

    /**
     * XXX 解法一 穷举法
     * 可以使用 双重循环
     *
     * case通过率50，但时间复杂度过大，导致该题运行超时
     *
     * 分析该解法：
     * 双重for循环，时间复杂度 O(N²)
     *
     * @param array 数组
     * @return 数组中逆序对的个数 % 1000000007 的值
     */
    private static int solution(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j])
                    count++;
            }
        }
        return count % divisor;
    }

    /**
     * 穷举法 时间复杂度O(N²)过大；那么bubble、selection、insertion三方法都不能用
     * 尝试参考 <em>归并排序（Merge Sort）；</em>
     * <i>使用额外的内存开销，以空间换时间</i>
     *
     * @param array 数组
     * @return 数组中逆序对的个数 % 1000000007 的值
     */
    private static int solution1(int[] array) {
        aux = new int[array.length];
        subMethodRec(array, 0, array.length - 1);
        /*for (int i : array) {
            System.out.println(i);
        }*/
        return count % divisor;
    }

    /** 辅助数组 */
    private static int[] aux;
    private static void subMethodRec(int[] array, int left, int right) {
        if (left >= right)
            return;
        // int mid = (left + right) >>> 1;
        int mid = left + (right - left) / 2;
        subMethodRec(array, left, mid);
        subMethodRec(array, mid + 1, right);
        merge(array, left, mid, right);
    }

    private static int count = 0;
    private static void merge(int[] array, int left, int mid, int right) {
        // 归并
        if (right + 1 - left >= 0)
            System.arraycopy(array, left, aux, left, right + 1 - left);
        //XXX 解法二：在排序之前计数，（当左下标所在元素大于右下标所在元素时，右下标右移，直至不再大于它；左下标右移一位；右下标之前元素均小于该左下标元素）
        /*int indexL = left, indexR = mid + 1;
        while (indexL <= mid && indexR <= right) {
            if (aux[indexL] > aux[indexR]) {
                indexR++;
                while (indexR <= right && aux[indexL] > aux[indexR])
                    indexR++;
                indexR--;
                count += (indexR - mid);
            }
            indexL++;
        }*/
        // 排序
        int index1 = left, index2 = mid + 1;
        for (int i = left; i <= right; i++) {
            // 左数组用尽
            if (index1 > mid) {
                array[i] = aux[index2++];
            }// 右数组用尽
            else if (index2 > right) {
                array[i] = aux[index1++];
            }// 左数组元素 < 右数组元素
            else if (aux[index1] < aux[index2]) {
                array[i] = aux[index1++];
            }//XXX 解法三 左数组元素 > 右数组元素；排序过程中，顺带统计 逆序对（左下标之后的元素，均大于该右下标所在元素）
            else if (aux[index2] < aux[index1]) {
                array[i] = aux[index2++];
                count+=(mid - index1 + 1);
            }
        }
    }
}
