package com.ipt.compdist;

public class CalcPIFreq12223 extends Thread {
	public long ini;
	public long fin;
	public double value;

	public double getValue() {
		return value;
	}

	public CalcPIFreq12223(long ini, long fin) {
		this.ini = ini;
		this.fin = fin;
	}

	public void run() {
		for (long i = this.ini; i < this.fin; i++) {
			value += (1.0 / (4.0 * i + 1)) - (1.0 / (4 * i + 3));
		}
		value *= 4;
	}

	public static double PI(long itera) throws InterruptedException {
		int procs = Runtime.getRuntime().availableProcessors();
		long dim = itera / procs;
		CalcPIFreq12223 threads[] = new CalcPIFreq12223[procs];

		for (int i = 0; i < threads.length; i++) {
			threads[i] = new CalcPIFreq12223(dim * i, dim * (i + 1));
			threads[i].start();
		}
		double pi = 0;
		for (int i = 0; i < threads.length; i++) {
			threads[i].join();
			pi += threads[i].value;
		}

		return pi;
	}

	public static double PIseq(long itera) {
		double sum = 0;
		for (long i = 0; i < itera; i++) {
			sum += (1.0 / (4.0 * i + 1)) - (1.0 / (4 * i + 3));
		}
		return sum * 4.0;
	}

	public static void main(String[] args) throws InterruptedException {
		int terms = (int) 1.0E8;
		long timeIniSeq = System.currentTimeMillis();
		double piseq = PIseq(terms);
		long timeSeq = System.currentTimeMillis() - timeIniSeq;

		long timeIniPar = System.currentTimeMillis();
		double pipar = PI(terms);
		long timePar = System.currentTimeMillis() - timeIniPar;

		System.out.println(timeSeq + " | " + piseq);
		System.out.println(timePar + " | " + pipar);
		System.out.println("Acel: " + timeSeq / (double) timePar);
	}

}
