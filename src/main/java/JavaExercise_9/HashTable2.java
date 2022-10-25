package JavaExercise_9;

import java.util.HashSet;
import java.util.Set;

public class HashTable2 {
    private int size =100;
    private int[] table = new int[size];

    public HashTable2() {
    }

    public HashTable2(int size) {
        this.size = size;
        this.table = new int[size];
    }

    public int hash(String key) {
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum % size;
    }
    public void insert(String key,Integer value) {
        int hashCode = hash(key);
        this.table[hash(key)] = value;
        System.out.println(key+" "+hashCode + "저장 완료");
    }

    public int search(String key) {
        return this.table[hash(key)];
    }

    public static void main(String[] args) {
        String[] names = {"DongyeonKang","SubinKang", "KwanwunKo", "HyunseokKo", "KyoungdukKoo", "YeonjiGu", "SoyeonKown", "OhsukKwon", "GunwooKim", "KiheonKim", "NayeongKim", "DohyeonKim", "MinkyoungKim", "MinjiKim", "SanghoKim", "SolbaeKim", "YejinKim", "EungjunKim", "JaegeunKim", "JeonghyeonKim", "JunhoKim", "JisuKim", "kimjinah", "HaneulKim", "HeejungKim", "KimoonPark", "EunbinPark", "JeongHoonPark", "JeminPark", "TaegeunPark", "JiwonBae", "SeunggeunBaek", "JihwanByeon", "HeungseopByeon", "JeongHeeSeo", "TaegeonSeo", "SeeYunSeok", "SuyeonSeong", "SeyoelSon", "MinjiSong", "JinwooSong", "hyunboSim", "SominAhn", "JiyoungAhn", "ChangbumAn", "SoonminEom", "HyeongsangOh", "SuinWoo", "JuwanWoo", "InkyuYoon", "GahyunLee", "DaonLee", "DohyunLee", "SanghunLee", "SujinLee", "AjinLee", "YeonJae", "HyeonjuLee", "HakjunYim", "SeoyunJang", "SeohyeonJang", "JinseonJang", "SujinJeon", "SeunghwanJeon", "DaehwanJung", "JaeHyunJeung", "HeejunJeong", "GukhyeonCho", "MunjuJo", "YejiJo", "ChanminJu", "MinjunChoi", "SujeongChoi", "SeunghoChoi", "AyeongChoi", "GeonjooHan", "JinhyuckHeo", "MinwooHwang", "SieunHwang", "JunhaHwang"};

        HashTable ht = new HashTable(200);
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < names.length; i++) {
            hashSet.add(ht.hash(names[i]));
            ht.insert(names[i], ht.hash(names[i]));
        }
        System.out.printf("%s %s\n", names.length, hashSet.size());
        System.out.println(ht.search("HakjunYim")+"저장위치");
    }


}
