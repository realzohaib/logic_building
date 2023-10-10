package sorting;

public class MergeSort {
	/*
	 1-Array ko divide kardo 2 sub-arrays mai by finding its middle point ( pivot )
	 2 -aur recursion ki wajah se array is point tak divide hoga ke usme bass 1 hi
	   element bachega aur voohi humari base condition hogi 
	3 -firr hume mergfe function bana padega  jo dono sorted arrays ko merge karenge  aur dono ka 
	mila kar 1 sorted array banayenge  
	
	*/
    static int[] mergeSort(int[] arr, int l, int r) {
        if (l == r) { 
            int[] base = { arr[l] };
            return base;
        }
        //middle point to split array in 2 parts
        int mid = (l + r) / 2;

        int[] left = mergeSort(arr, l, mid);
        int[] right = mergeSort(arr, mid + 1, r);

        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right) {
    	
    	//is array mai left aur right array ko compare karkar fill karenege sorted order mai.
        int[] ans = new int[left.length + right.length];
        /* i is for left array 
         * j is for right array
         * k is for ans array
        */
        int i, j, k;
        i = j = k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                ans[k] = left[i++];
            } else {
                ans[k] = right[j++];
            }
            k++;
        }

        while (i < left.length) {
            ans[k++] = left[i++];
        }

        while (j < right.length) {
            ans[k++] = right[j++];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 3, 2, 1, 4, 5 };
        int[] sort = mergeSort(arr, 0, arr.length - 1);
        for (int ans : sort) {
            System.out.print(" " +ans);
        }
    }
}

/*
 * Explanation
 * 
 * Step 1: Shuruaat karo ek aise array se jo sorted nahi hai.
 * 
 * Step 2: Is array ko do sub-arrays mein baatein, aur un sub-arrays ko middle
 * point dhundkar divide karo. Yeh step "divide and conquer" approach ke liye
 * important hai.
 * 
 * Step 3: Recursion ki madad se, array ko aise chhota karo ki bas ek hi element
 * bacha ho. Yeh hamari base condition hai.
 * 
 * Step 4: Ab hume ek "merge" function banane ki zarurat hai, jo dono sorted
 * arrays ko milakar ek sorted array banayega.
 * 
 * Step 5: Is process ko samajhne ke liye, imagine karo ki kuch chhota sa kaam
 * karna hai. Agar kuch chhota hai, toh usse add kar lo.
 * 
 * Step 6: Jab hum sub-arrays ko divide aur merge karte hain, toh woh
 * chhote-chhote elements ko sahi order mein arrange karte hain.
 * 
 * Step 7: Jab sub-arrays merge hote hain, toh pura array sorted ho jata hai.
 * 
 * Step 8: Merge Sort ek efficient aur stable sorting algorithm hai, jiska samay
 * complexity hamesha O(n log n) hota hai, chahe kuch bhi situation ho. Yeh bade
 * datasets ko sort karne ke liye achha hota hai.
 * 
 * Step 9: Iske bavjood, yeh ho sakta hai ki Merge Sort chote arrays ke liye
 * kisi aur sorting algorithm se thoda adhik samay le, kyun ki isme merge karte
 * waqt adhik memory aur function calls ka upayog hota hai.
 * 
 * Step 10: Merge Sort ki recursion depth O(log n) tak seemit hoti hai, jisse
 * bade datasets ko sort karne ke liye bina stack overflow ke upayukt hota hai.
 * 
 * Step 11: Yeh algorithm samjhne mein asaan hota hai aur iska consistent
 * performance iske prasiddhi ke peeche ek karan hai.
 * 
 * Step 12: Yeh stable sorting algorithm hai, matlab equal elements ke relative
 * order ko maintain karta hai.
 * 
 */
