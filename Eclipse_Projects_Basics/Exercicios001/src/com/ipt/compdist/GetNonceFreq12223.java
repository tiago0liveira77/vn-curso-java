package com.ipt.compdist;

public class GetNonceFreq12223 extends Thread{
	public static int MAX_NONCE = (int) 1E9;
	public long ini;
	public long fin;
	public String data;
	public int difficult;
	
	int result = -1;
	
	public GetNonceFreq12223(long ini, long fin, String data, int difficult) {
		this.ini = ini;
		this.fin = fin;
		this.data = data;
		this.difficult = difficult;
	}
	
	public void run() {
		String zeros = String.format("%0" + difficult + "d", 0);
		int nonce = 0;
		while(nonce < MAX_NONCE) {
			//String hash = getHash(nonce + data);
			String hash = "";
			if(hash.startsWith(zeros)) {
				result = nonce;
			}
			nonce++;
		}
	}
	
	public static int getNonceP(long itera, String data, int diff) throws InterruptedException {
		int procs = Runtime.getRuntime().availableProcessors();
		long dim = itera / procs;
		GetNonceFreq12223 threads[] = new GetNonceFreq12223[procs];
		
		for(int i = 0; i < threads.length;i++) {
			long start = dim * i;
			long end = (i == procs -1) ? MAX_NONCE : dim * i + dim;
			threads[i] = new GetNonceFreq12223(start, end, data, diff);
			threads[i].start();
		}
		
		for(int i = 0; i < threads.length;i++) {
			threads[i].join();
		}
		
		return 1;
	}
	
	
}
