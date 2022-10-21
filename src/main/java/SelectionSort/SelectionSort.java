package SelectionSort;

public class SelectionSort {
    public static void SelectionSort(int v[]){
        int i, j, menor, troca;
        for(i = 0; i < v.length - 1; i++){
            menor = i;
            for(j = i + 1; j < v.length; j++){
                if(v[j] < v[menor])
                    menor = j;
            }
            if(i != menor){
                troca = v[i];
                v[i] = v[menor];
                v[menor] = troca;
            }
        }
    }
}
