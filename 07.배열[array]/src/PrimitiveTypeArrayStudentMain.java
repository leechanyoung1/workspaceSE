
public class PrimitiveTypeArrayStudentMain {

	public static void main(String[] args) {
		System.out.println("-----학생10명 성적 데이터를 저장하기위한 배열객체생성 초기화-----");
		int[] noArray = {1,2,3,4,5,6,7,8,9,10};
		String[] nameArray= {"kim","cim","aim","qim","wim","eim","rim","tim","yim","uim"};
		int[] korArray= {86,87,95,81,85,84,70,80,70,60};
		int[] engArray= {95,86,91,72,71,41,71,61,91,80};
		int[] mathArray= {90,90,90,80,90,80,90,60,80,70};
		int[] totArray= {0,0,0,0,0,0,0,0,0,0};
		double[] avgArray= {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};
		char[] gradeArray= {'F','F','F','F','F','F','F','F','F','F'};
		int[] rankArray= {1,1,1,1,1,1,1,1,1,1};
		
		/*
		 * 총점,평균,평점계산
		 */
		for (int i = 0; i < noArray.length; i++) {
			totArray[i]=korArray[i]+engArray[i]+mathArray[i];
			avgArray[i]=totArray[i]/3.0;
			
			if(avgArray[i]>=90) {
				gradeArray[i]='A';
			}else if(avgArray[i]>=80) {
				gradeArray[i]='B';
			}else if(avgArray[i]>=70) {
				gradeArray[i]='C';
			}else if(avgArray[i]>=60) {
				gradeArray[i]='D';
			}else {
				gradeArray[i]='F';
			}
			
			
			
		}
		/*
		 * 총점으로 석차계산
		 */
		/*
		 * 1번학생(index-->0)
		 */
		for (int i = 0; i < totArray.length; i++) {
			for (int j = 0; j < totArray.length; j++) {
				if (totArray[i] < totArray[j]) {
					rankArray[i]++;
				}

			}
		}
		
		
		
	/*
	 * 학생검색(번호,국어,영어,수학,학점,석차)
	 */
	/*
	 * 번호3번인 학생 1명찾아서 1명정보출력(학생번호는 중복되지않는다)
	 */
		System.out.println("번호3번인 학생 1명찾아서 1명정보출력(학생번호는 중복되지않는다)");
		for (int i = 0; i < noArray.length; i++) {
			if(noArray[i]==3) {
				System.out.printf("%4d %-6s %d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
					engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
			}
		}
		/*
		 * 국어점수 80점인 학생들 여러명 찾아서 여러명정보출력
		 */
		System.out.println(">>국어점수 80점인 학생들 여러명 찾아서 여러명정보출력");
		for (int i = 0; i < noArray.length; i++) {
			if(korArray[i]==80) {
				System.out.printf("%4d %-6s %d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
				
			}
		}
		
		/*
		 * 영어점수 50점이하인 학생들 여러명 찾아서 여러명정보출력
		 */
		System.out.println(">>영어점수 50점이하인 학생들 여러명 찾아서 여러명정보출력");
		for (int i = 0; i < noArray.length; i++) {
			if(engArray[i]<=50) {
				System.out.printf("%4d %-6s %d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
				
			}
		}
		/*
		 * 수학점수 70점이상인 학생들 여러명 찾아서 여러명정보출력
		 */
		System.out.println(">>수학점수 70점이상인 학생들 여러명 찾아서 여러명정보출력");
		for (int i = 0; i < noArray.length; i++) {
			if(mathArray[i]>=70) {
				System.out.printf("%4d %-6s %d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
				
			}
		}
		/*
		 * 학점이 D학점이하인 학생모두찾아서 여러명 정보출력
		 */
		System.out.println(">>학점이 D학점이하인 학생모두찾아서 여러명 정보출력");
		for (int i = 0; i < noArray.length; i++) {
			if(gradeArray[i]>='D') {
				System.out.printf("%4d %-6s %d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
				
			}
		}
		
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>> 정렬전  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.printf("---------------학생 성적출력-------------------\n");
		System.out.printf("%s %3s %s %s %s %s %3s %s %s%n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("-----------------------------------------------\n");
		for (int i = 0; i < noArray.length; i++) {
			System.out.printf("%4d %-6s %d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
					engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
		}
		
		/*
		 학생총점순으로 오름차순정렬
		 https://www.youtube.com/watch?v=ebI54DXYQG8
		 */
		int a =10;
		int b =3;
		//swap a,b
		System.out.println(a);
		System.out.println(b);
		int temp = a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
	
		
		for (int i = 0; i < noArray.length - 1; i++) {
				for (int j = 0; j < noArray.length - 1; j++) {
					if (totArray[j] < totArray[j + 1]) {
						
						int tempTot = totArray[j];
						totArray[j] = totArray[j + 1];
						totArray[j + 1] = tempTot;
						
						String tempname = nameArray[j];
						nameArray[j] = nameArray[j + 1];
						nameArray[j + 1] = tempname;
						
						double tempavg = avgArray[j];
						avgArray[j] = avgArray[j + 1];
						avgArray[j + 1] = tempavg;
						
						int tempmath = mathArray[j];
						mathArray[j] = mathArray[j + 1];
						mathArray[j + 1] = tempmath;
						
						int tempeng = engArray[j];
						engArray[j] = engArray[j + 1];
						engArray[j + 1] = tempeng;
						
						int tempkor = korArray[j];
						korArray[j] = korArray[j + 1];
						korArray[j + 1] = tempkor;
						
						char tempgrade = gradeArray[j];
						gradeArray[j] = gradeArray[j + 1];
						gradeArray[j + 1] = tempgrade;
						
						int temprank = rankArray[j];
						rankArray[j] = rankArray[j + 1];
						rankArray[j + 1] = temprank;
						
						int tempno = noArray[j];
						noArray[j] = noArray[j + 1];
						noArray[j + 1] = tempno;
						
						// no,name,kor,eng,math,avg,grade,rank
					}
				
			}
		}
	
		
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>> 정렬후 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.printf("---------------학생 성적출력-------------------\n");
		System.out.printf("%s %3s %s %s %s %s %3s %s %s%n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("-----------------------------------------------\n");
		for (int i = 0; i < noArray.length; i++) {
			System.out.printf("%4d %-6s %d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
					engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
		}
		
		
		
		
		
		/*System.out.printf("--------------학생 성적출력-------------------%n");
		System.out.printf("%s %3s %3s %s %s %s %s %s %s%n","학번","이름","국어", "영어","수학","총점","평균","평점","석차");
		System.out.printf("-----------------------------------------------%n");
		for (int i = 0; i < noArray.length; i++) {
			System.out.printf("%4d %-6s %d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
					engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
		}*/
	}
}
