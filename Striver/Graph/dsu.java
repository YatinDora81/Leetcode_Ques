package Striver.Graph;

import java.util.*;

class DisjointSet{
    List<Integer> par;
    List<Integer> rank;
    List<Integer> size;

    // take par
    // comp rank

    public DisjointSet(int n){
        par = new ArrayList<>();
        rank = new ArrayList<>();
        size = new ArrayList<>();

        for(int i=0;i<n;i++){
            par.add(i);
            rank.add(0);
            size.add(1);
        }
    }

    public int findUltParent(int node){
        if(par.get(node)==node) return node;
        int up = findUltParent(par.get(node));
        par.set(node, up);
        return par.get(up);
    }

    public void unionByRank(int u,int v){
        int uu = findUltParent(u);
        int uv = findUltParent(v);

        if(uu==uv) return;
        if(rank.get(uu)<rank.get(uv)){
            par.set(uu, uv);
        }
        else if(rank.get(uv)<rank.get(uu)){
            par.set(uv, uu);
        }else{
            par.set(uv, uu);
            rank.set(uu, rank.get(uu) + 1);
        }
    }

    public void unionBySize(int u,int v){
        int uu = findUltParent(u);
        int uv = findUltParent(v);

        if(uu==uv) return ;
        if(size.get(uu)<size.get(uv)){
            par.set(uu, uv);
            size.set(uv, size.get(uv)+size.get(uu));
        }else{
            par.set(uv, uu);
            size.set(uu, size.get(uv)+size.get(uu));
        }
    }
}

public class dsu {
    public static void main(String[] args) {
        
    }
}
