package JavaExercise_9;

import java.util.HashSet;
import java.util.Set;

public class HashTable {

    private int size = 10000;
    private int[] table=  new int[size];

    public HashTable() {
    }

    public HashTable(int size) {
        this.size = size;
        this.table = new int[size];
    }

    public int hash(String key) {
        int asciiSum = 0; //초기화
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i); //자동 형변환
        }
       // System.out.println(asciiSum);
        return asciiSum % size; //size크기의 배열 어딘가로 가게함
    }

    public void insert(String key,Integer value) {// 데이터를 저장하는 함수 .insert(key,value)설계
        int hashCode = hash(key);
        this.table[hash(key)] = value;
        System.out.println(key+" "+hashCode + "저장 완료");
    }

    public int search(String key) {//.search(key)형태로 값을 받아온다
        return this.table[hash(key)];
       // this.table[hash(key)] key를 다시 hash로 만들어서 array에서 값을 뽑아 옵니다.
    }



    public static void main(String[] args) {
        String[] names = new String[]{"DongyeonKang",
                "SubinKang", "KwanwunKo", "HyunseokKo", "KyoungdukKoo", "YeonjiGu", "SoyeonKown", "OhsukKwon", "GunwooKim", "KiheonKim", "NayeongKim", "DohyeonKim", "MinkyoungKim", "MinjiKim", "SanghoKim", "SolbaeKim", "YejinKim", "EungjunKim", "JaegeunKim", "JeonghyeonKim", "JunhoKim", "JisuKim", "kimjinah", "HaneulKim", "HeejungKim", "KimoonPark", "EunbinPark", "JeongHoonPark", "JeminPark", "TaegeunPark", "JiwonBae", "SeunggeunBaek", "JihwanByeon", "HeungseopByeon", "JeongHeeSeo", "TaegeonSeo", "SeeYunSeok", "SuyeonSeong", "SeyoelSon", "MinjiSong", "JinwooSong", "hyunboSim", "SominAhn", "JiyoungAhn", "ChangbumAn", "SoonminEom",
                "HyeongsangOh", "SuinWoo", "JuwanWoo", "InkyuYoon", "GahyunLee", "DaonLee", "DohyunLee", "SanghunLee", "SujinLee", "AjinLee", "YeonJae", "HyeonjuLee", "HakjunYim", "SeoyunJang", "SeohyeonJang", "JinseonJang", "SujinJeon", "SeunghwanJeon", "DaehwanJung", "JaeHyunJeung", "HeejunJeong", "GukhyeonCho", "MunjuJo", "YejiJo", "ChanminJu", "MinjunChoi", "SujeongChoi", "SeunghoChoi", "AyeongChoi", "GeonjooHan", "JinhyuckHeo", "MinwooHwang", "SieunHwang",
                "JunhaHwang"};

        HashTable ht = new HashTable(200);//생성자로
        for (int i = 0; i < names.length; i++) {
            ht.insert(names[i],ht.hash(names[i]));
        }
        System.out.println(ht.search("DongyeonKang"));
        System.out.println(ht.search("JiyoungAhn"));

        }
    }


