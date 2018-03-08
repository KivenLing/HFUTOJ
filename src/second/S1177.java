package second;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S1177 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			List<String> ans = new ArrayList<>();
			int n = in.nextInt();
			UnionFind uf = new UnionFind(n + 1);
			int m = in.nextInt();
			for(int i = 0; i < m; i++) {
				String func = in.next();
				int num1 = in.nextInt();
				int num2 = in.nextInt();
				if("U".equals(func)) {
					uf.unionElements(num1, num2);
				} else if("Q".equals(func)){
					if(uf.isConnected(num1, num2))
						ans.add("Yes");
					else
						ans.add("No");
				}
			}
			for (String s : ans) {
				System.out.println(s);
			}
		}

		in.close();
	}

}

class UnionFind {
	private int[] parent;
	private int[] sz;//记录i的集合大小
	int count;
	
	public UnionFind(int n){
		parent = new int[n];
		sz = new int[n];
		count = n;
		
		for(int i = 0; i < count; i++){
			parent[i] = i;
			sz[i] = 1;
		}
	}
	
	public int find(int p){
		assert(p >= 0 && p < count);
		while(p != parent[p])
			p = parent[p];
		return p;
	}
	
	public boolean isConnected(int p, int q){
		return find(p) == find(q);
	}
	
	public void unionElements(int p, int q){
		int pRoot = find(p);
		int qRoot = find(q);
		
		if(pRoot == qRoot)
			return;
		
		if(sz[pRoot] > sz[qRoot]){//q所在集合小，小的结合到大的
			parent[qRoot] = pRoot;
			sz[pRoot] += sz[qRoot];
		}else{
			parent[pRoot] = qRoot;
			sz[qRoot] += sz[pRoot];
		}
	}
}
