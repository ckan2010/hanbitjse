package controller;

public class MaxMin {
	public String maxmin(int[] inputScore){
		int score[] = inputScore;
		int studCount = 0,i = 0, maxGrade = 0, minGrade = 100;
		for (; i < score.length; i++) {
			if (score[i] > maxGrade ) {
				maxGrade = score[i];				
			} if (score[i] < minGrade){
				minGrade = score[i];
			}
		}
		return "최고점 : "+maxGrade+"\t최저점 : "+minGrade;
	}
}
