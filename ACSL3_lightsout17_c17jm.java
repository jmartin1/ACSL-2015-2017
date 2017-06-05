import java.util.Scanner;
/**
 * 
 * @author Julia Martin
 * 
 * 
 *
 */
public class ACSL3_lightsout17_c17jm {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);


		//first input
		System.out.println("What is the first line of input?");
		String originalinput1 = scan.nextLine();
		String[][] doublearray1 = converttodoubleArray(originalinput1);

		//second input
		System.out.println("What is the second line of input?");
		String originalinput2 = scan.nextLine();
		String[][] doublearray2 = converttodoubleArray(originalinput2);

		//third input
		System.out.println("What is the third line of input?");
		String originalinput3 = scan.nextLine();
		String[][] doublearray3 = converttodoubleArray(originalinput3);

		//fourthinput
		System.out.println("What is the fourth line of input?");
		String originalinput4 = scan.nextLine();
		String[][] doublearray4 = converttodoubleArray(originalinput4);

		//fifthinput
		System.out.println("What is the fifth line of input?");
		String originalinput5 = scan.nextLine();
		String[][] doublearray5 = converttodoubleArray(originalinput5);

		//sixthinput
		System.out.println("What is the sixth line of input?");
		String originalinput6 = scan.nextLine();
		String[][] doublearray6 = converttodoubleArray(originalinput6);

		//print
		//for (int m = 0; m < 8; m++) {
			//for (int n = 0; n < 8; n++) {
				//System.out.print(doublearray1[m][n]);
				//if (n == 7) {
					//System.out.println();
				//}
			//}
		//}

		//System.out.println();

		//for (int t = 0; t < 8; t++) {
			//for (int r = 0; r < 8; r++) {
				//System.out.print(doublearray2[t][r]);
				//if (r == 7) {
					//System.out.println();
				//}
			//}
		//}

		//System.out.println();

		//print out board:


		//check array1 to array2
		System.out.println(Integer.toString(check(doublearray1, doublearray2)));
		System.out.println(Integer.toString(check(doublearray2, doublearray3)));
		System.out.println(Integer.toString(check(doublearray3, doublearray4)));
		System.out.println(Integer.toString(check(doublearray4, doublearray5)));
		System.out.println(Integer.toString(check(doublearray5, doublearray6)));
	}

	public static String[][] converttodoubleArray(String input) {
		String[] splited = input.split(" ");
		String completeinput = "";
		for(int q = 0; q < splited.length; q++) {
			int num = Integer.parseInt(splited[q], 16);
			String binary = Integer.toBinaryString(num);
			String completebinary = String.format("%16s", binary).replace(" ", "0");
			completeinput = completeinput.concat(completebinary);
		}
		//System.out.println(completeinput);

		//put input into double array
		//String reverse = new StringBuffer(completeinput).reverse().toString();
		String[] array = completeinput.split("(?!^)");

		//for(int y = 0; y < array.length; y++) {
		//System.out.print(array[y]);
		//}

		String[][] doublearray = new String[8][8];
		int k=0;

		for (int j = 7; j >-1; j --) {
			for (int i = 0; i <8; i++) {
				doublearray[j][i] = array[k++];
			}
		}

		return doublearray;
	}

	public static int check(String[][] firstarray, String[][] secondarray) {
		int i;
		int j;
		int answer = 0;
		for (j = 0; j < 8; j++) {
			for (i = 0; i < 8; i++) {
				if (j != 0 && i!= 0 && j != 6 && i != 6 && j!= 7 && i!=7 && j!=1 && i!=1) {
					if(!(firstarray[j][i].equals(secondarray[j][i]))) {
						if(!(firstarray[j+1][i].equals(secondarray[j+1][i]))) { 
							if( !(firstarray[j+2][i].equals(secondarray[j+2][i]))) {
								if (!(firstarray[j-1][i].equals(secondarray[j-1][i]))){
									if (!(firstarray[j-2][i].equals(secondarray[j-2][i]))) {
										if (!(firstarray[j][i+1].equals(secondarray[j][i+1]))) { 
											if (!(firstarray[j][i+2].equals(secondarray[j][i+2]))) {
												if (!(firstarray[j][i-1].equals(secondarray[j][i-1]))) {
													if (!(firstarray[j][i-2].equals(secondarray[j][i-2]))) {
														if (!(firstarray[j+1][i+1].equals(secondarray[j+1][i+1]))) {
															if (!(firstarray[j+1][i-1].equals(secondarray[j+1][i-1]))) {
																if (!(firstarray[j-1][i-1].equals(secondarray[j-1][i-1]))) {
																	if (!(firstarray[j-1][i+1].equals(secondarray[j-1][i+1]))) {
																		answer = (8-j)*10 + (i+1);
																		return answer;
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
				if (j == 0 && i!= 0 && j != 6 && i != 6 && j!= 7 && i!=7 && j!=1 && i!=1) {
					if(!(firstarray[j][i].equals(secondarray[j][i]))) {
						if(!(firstarray[j+1][i].equals(secondarray[j+1][i]))) { 
							if( !(firstarray[j+2][i].equals(secondarray[j+2][i]))) {
								if (!(firstarray[j][i+1].equals(secondarray[j][i+1]))) { 
									if (!(firstarray[j][i+2].equals(secondarray[j][i+2]))) {
										if (!(firstarray[j][i-1].equals(secondarray[j][i-1]))) {
											if (!(firstarray[j][i-2].equals(secondarray[j][i-2]))) {
												if (!(firstarray[j+1][i+1].equals(secondarray[j+1][i+1]))) {
													if (!(firstarray[j+1][i-1].equals(secondarray[j+1][i-1]))) {
														answer = (8-j)*10 + (i+1);
														return answer;
													}
												}
											}
										}
									}
								}
							}
						}
					}
				} //close
				if (j != 0 && i == 0 && j != 6 && i != 6 && j!= 7 && i!=7 && j!=1 && i!=1) {
					if(!(firstarray[j][i].equals(secondarray[j][i]))) {
						if(!(firstarray[j+1][i].equals(secondarray[j+1][i]))) { 
							if( !(firstarray[j+2][i].equals(secondarray[j+2][i]))) {
								if (!(firstarray[j-1][i].equals(secondarray[j-1][i]))){
									if (!(firstarray[j-2][i].equals(secondarray[j-2][i]))) {
										if (!(firstarray[j][i+1].equals(secondarray[j][i+1]))) { 
											if (!(firstarray[j][i+2].equals(secondarray[j][i+2]))) {
												if (!(firstarray[j+1][i+1].equals(secondarray[j+1][i+1]))) {
													if (!(firstarray[j-1][i+1].equals(secondarray[j-1][i+1]))) {
														answer = (8-j)*10 + (i+1);
														return answer;							
													}
												}
											}
										}
									}
								}
							}
						}
					}
				} //close
				if (j != 0 && i != 0 && j != 6 && i != 6 && j!= 7 && i!=7 && j==1 && i!=1) {
					if(!(firstarray[j][i].equals(secondarray[j][i]))) {
						if(!(firstarray[j+1][i].equals(secondarray[j+1][i]))) { 
							if( !(firstarray[j+2][i].equals(secondarray[j+2][i]))) {
								if (!(firstarray[j-1][i].equals(secondarray[j-1][i]))){
									if (!(firstarray[j][i+1].equals(secondarray[j][i+1]))) { 
										if (!(firstarray[j][i+2].equals(secondarray[j][i+2]))) {
											if (!(firstarray[j][i-1].equals(secondarray[j][i-1]))) {
												if (!(firstarray[j][i-2].equals(secondarray[j][i-2]))) {
													if (!(firstarray[j+1][i+1].equals(secondarray[j+1][i+1]))) {
														if (!(firstarray[j+1][i-1].equals(secondarray[j+1][i-1]))) {
															if (!(firstarray[j-1][i-1].equals(secondarray[j-1][i-1]))) {
																if (!(firstarray[j-1][i+1].equals(secondarray[j-1][i+1]))) {
																	answer = (8-j)*10 + (i+1);
																	return answer;
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				} //close
				if (j != 0 && i != 0 && j != 6 && i != 6 && j!= 7 && i!=7 && j!=1 && i==1) {
					if(!(firstarray[j][i].equals(secondarray[j][i]))) {
						if(!(firstarray[j+1][i].equals(secondarray[j+1][i]))) { 
							if( !(firstarray[j+2][i].equals(secondarray[j+2][i]))) {
								if (!(firstarray[j-1][i].equals(secondarray[j-1][i]))){
									if (!(firstarray[j-2][i].equals(secondarray[j-2][i]))) {
										if (!(firstarray[j][i+1].equals(secondarray[j][i+1]))) { 
											if (!(firstarray[j][i+2].equals(secondarray[j][i+2]))) {
												if (!(firstarray[j][i-1].equals(secondarray[j][i-1]))) {
													if (!(firstarray[j+1][i+1].equals(secondarray[j+1][i+1]))) {
														if (!(firstarray[j+1][i-1].equals(secondarray[j+1][i-1]))) {
															if (!(firstarray[j-1][i-1].equals(secondarray[j-1][i-1]))) {
																if (!(firstarray[j-1][i+1].equals(secondarray[j-1][i+1]))) {
																	answer = (8-j)*10 + (i+1);
																	return answer;
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				} //close
				if (j != 0 && i != 0 && j != 6 && i != 6 && j == 7 && i!=7 && j!=1 && i!=1) {
					if(!(firstarray[j][i].equals(secondarray[j][i]))) {
						if (!(firstarray[j-1][i].equals(secondarray[j-1][i]))){
							if (!(firstarray[j-2][i].equals(secondarray[j-2][i]))) {
								if (!(firstarray[j][i+1].equals(secondarray[j][i+1]))) { 
									if (!(firstarray[j][i+2].equals(secondarray[j][i+2]))) {
										if (!(firstarray[j][i-1].equals(secondarray[j][i-1]))) {
											if (!(firstarray[j][i-2].equals(secondarray[j][i-2]))) {
												if (!(firstarray[j-1][i-1].equals(secondarray[j-1][i-1]))) {
													if (!(firstarray[j-1][i+1].equals(secondarray[j-1][i+1]))) {
														answer = (8-j)*10 + (i+1);
														return answer;
													}
												}
											}
										}
									}
								}
							}
						}
					}
				} //close
				if (j != 0 && i != 0 && j != 6 && i != 6 && j!=7 && i==7 && j!=1 && i!=1) {
					if(!(firstarray[j][i].equals(secondarray[j][i]))) {
						if(!(firstarray[j+1][i].equals(secondarray[j+1][i]))) { 
							if( !(firstarray[j+2][i].equals(secondarray[j+2][i]))) {
								if (!(firstarray[j-1][i].equals(secondarray[j-1][i]))){
									if (!(firstarray[j-2][i].equals(secondarray[j-2][i]))) {
										if (!(firstarray[j][i-1].equals(secondarray[j][i-1]))) {
											if (!(firstarray[j][i-2].equals(secondarray[j][i-2]))) {
												if (!(firstarray[j+1][i-1].equals(secondarray[j+1][i-1]))) {
													if (!(firstarray[j-1][i-1].equals(secondarray[j-1][i-1]))) {
														answer = (8-j)*10 + (i+1);
														return answer;
													}
												}
											}
										}
									}
								}
							}
						}
					}
				} //close
				if (j != 0 && i != 0 && j == 6 && i != 6 && j!=7 && i!=7 && j!=1 && i!=1) {
					if(!(firstarray[j][i].equals(secondarray[j][i]))) {
						if(!(firstarray[j+1][i].equals(secondarray[j+1][i]))) { 
							if (!(firstarray[j-1][i].equals(secondarray[j-1][i]))){
								if (!(firstarray[j-2][i].equals(secondarray[j-2][i]))) {
									if (!(firstarray[j][i+1].equals(secondarray[j][i+1]))) { 
										if (!(firstarray[j][i+2].equals(secondarray[j][i+2]))) {
											if (!(firstarray[j][i-1].equals(secondarray[j][i-1]))) {
												if (!(firstarray[j][i-2].equals(secondarray[j][i-2]))) {
													if (!(firstarray[j+1][i+1].equals(secondarray[j+1][i+1]))) {
														if (!(firstarray[j+1][i-1].equals(secondarray[j+1][i-1]))) {
															if (!(firstarray[j-1][i-1].equals(secondarray[j-1][i-1]))) {
																if (!(firstarray[j-1][i+1].equals(secondarray[j-1][i+1]))) {
																	answer = (8-j)*10 + (i+1);
																	return answer;
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				} //close
				if (j!=0 && i != 0 && j!=6 && i==6 && j!=7 && i!=7 && j!=1 && i!=1) {
					if(!(firstarray[j][i].equals(secondarray[j][i]))) {
						if(!(firstarray[j+1][i].equals(secondarray[j+1][i]))) { 
							if( !(firstarray[j+2][i].equals(secondarray[j+2][i]))) {
								if (!(firstarray[j-1][i].equals(secondarray[j-1][i]))){
									if (!(firstarray[j-2][i].equals(secondarray[j-2][i]))) {
										if (!(firstarray[j][i+1].equals(secondarray[j][i+1]))) { 
											if (!(firstarray[j][i-1].equals(secondarray[j][i-1]))) {
												if (!(firstarray[j][i-2].equals(secondarray[j][i-2]))) {
													if (!(firstarray[j+1][i+1].equals(secondarray[j+1][i+1]))) {
														if (!(firstarray[j+1][i-1].equals(secondarray[j+1][i-1]))) {
															if (!(firstarray[j-1][i-1].equals(secondarray[j-1][i-1]))) {
																if (!(firstarray[j-1][i+1].equals(secondarray[j-1][i+1]))) {
																	answer = (8-j)*10 + (i+1);
																	return answer;
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				} //close
				//top left corner
				if (j==0 && i == 0 && j!=6 && i!=6 && j!=7 && i!=7 && j!=1 && i!=1) {
					if(!(firstarray[j][i].equals(secondarray[j][i]))) {
						if(!(firstarray[j+1][i].equals(secondarray[j+1][i]))) { 
							if( !(firstarray[j+2][i].equals(secondarray[j+2][i]))) {
								if (!(firstarray[j][i+1].equals(secondarray[j][i+1]))) { 
									if (!(firstarray[j][i+2].equals(secondarray[j][i+2]))) {
										if (!(firstarray[j+1][i+1].equals(secondarray[j+1][i+1]))) {
											answer = (8-j)*10 + (i+1);
											return answer;	
										}
									}
								}
							}
						}
					}
				} //close
				//top right corner
				if (j==0 && i!=0 && j!=6 && i!=6 && j!=7 && i==7 && j!=1 && i!=1) {
					if(!(firstarray[j][i].equals(secondarray[j][i]))) {
						if(!(firstarray[j+1][i].equals(secondarray[j+1][i]))) { 
							if( !(firstarray[j+2][i].equals(secondarray[j+2][i]))) {
								if (!(firstarray[j][i-1].equals(secondarray[j][i-1]))) {
									if (!(firstarray[j][i-2].equals(secondarray[j][i-2]))) {
										if (!(firstarray[j+1][i-1].equals(secondarray[j+1][i-1]))) {
											answer = (8-j)*10 + (i+1);
											return answer;
										}
									}
								}
							}
						}
					}
				} //close
				//bottom right corner
				if (j!=0 && i!=0 && j!=6 && i!=6 && j==7 && i==7 && j!=1 && i!=1) {
					if(!(firstarray[j][i].equals(secondarray[j][i]))) {
						if (!(firstarray[j-1][i].equals(secondarray[j-1][i]))){
							if (!(firstarray[j-2][i].equals(secondarray[j-2][i]))) {
								if (!(firstarray[j][i-1].equals(secondarray[j][i-1]))) {
									if (!(firstarray[j][i-2].equals(secondarray[j][i-2]))) {
										if (!(firstarray[j-1][i-1].equals(secondarray[j-1][i-1]))) {
											answer = (8-j)*10 + (i+1);
											return answer;
										}
									}
								}
							}
						}
					}
				} //close
				//bottom left corner
				if (j!=0 && i==0 && j!=6 && i!=6 && j==7 && i!=7 && j!=1 && i!=1) {
					if(!(firstarray[j][i].equals(secondarray[j][i]))) {
						if (!(firstarray[j-1][i].equals(secondarray[j-1][i]))){
							if (!(firstarray[j-2][i].equals(secondarray[j-2][i]))) {
								if (!(firstarray[j][i+1].equals(secondarray[j][i+1]))) { 
									if (!(firstarray[j][i+2].equals(secondarray[j][i+2]))) {
										if (!(firstarray[j-1][i+1].equals(secondarray[j-1][i+1]))) {
											answer = (8-j)*10 + (i+1);
											return answer;
										}
									}
								}
							}
						}
					}
				} //close
				//top left second/inside corner
				if (j!=0 && i!=0 && j!=6 && i!=6 && j!=7 && i!=7 && j==1 && i==1) {
					if(!(firstarray[j][i].equals(secondarray[j][i]))) {
						if(!(firstarray[j+1][i].equals(secondarray[j+1][i]))) { 
							if( !(firstarray[j+2][i].equals(secondarray[j+2][i]))) {
								if (!(firstarray[j-1][i].equals(secondarray[j-1][i]))){
									if (!(firstarray[j][i+1].equals(secondarray[j][i+1]))) { 
										if (!(firstarray[j][i+2].equals(secondarray[j][i+2]))) {
											if (!(firstarray[j][i-1].equals(secondarray[j][i-1]))) {
												if (!(firstarray[j+1][i+1].equals(secondarray[j+1][i+1]))) {
													if (!(firstarray[j+1][i-1].equals(secondarray[j+1][i-1]))) {
														if (!(firstarray[j-1][i-1].equals(secondarray[j-1][i-1]))) {
															if (!(firstarray[j-1][i+1].equals(secondarray[j-1][i+1]))) {
																answer = (8-j)*10 + (i+1);
																return answer;
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				} //close
				//top right second/inside corner
				if (j!=0 && i!=0 && j!=6 && i==6 && j!=7 && i!=7 && j==1 && i!=1) {
					if(!(firstarray[j][i].equals(secondarray[j][i]))) {
						if(!(firstarray[j+1][i].equals(secondarray[j+1][i]))) { 
							if( !(firstarray[j+2][i].equals(secondarray[j+2][i]))) {
								if (!(firstarray[j-1][i].equals(secondarray[j-1][i]))){
									if (!(firstarray[j][i+1].equals(secondarray[j][i+1]))) { 
										if (!(firstarray[j][i-1].equals(secondarray[j][i-1]))) {
											if (!(firstarray[j][i-2].equals(secondarray[j][i-2]))) {
												if (!(firstarray[j+1][i+1].equals(secondarray[j+1][i+1]))) {
													if (!(firstarray[j+1][i-1].equals(secondarray[j+1][i-1]))) {
														if (!(firstarray[j-1][i-1].equals(secondarray[j-1][i-1]))) {
															if (!(firstarray[j-1][i+1].equals(secondarray[j-1][i+1]))) {
																answer = (8-j)*10 + (i+1);
																return answer;
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				} //close
				//bottom right second/inside corner
				if (j!=0 && i!=0 && j==6 && i==6 && j!=7 && i!=7 && j!=1 && i!=1) {
					if(!(firstarray[j][i].equals(secondarray[j][i]))) {
						if(!(firstarray[j+1][i].equals(secondarray[j+1][i]))) { 
							if (!(firstarray[j-1][i].equals(secondarray[j-1][i]))){
								if (!(firstarray[j-2][i].equals(secondarray[j-2][i]))) {
									if (!(firstarray[j][i+1].equals(secondarray[j][i+1]))) { 
										if (!(firstarray[j][i-1].equals(secondarray[j][i-1]))) {
											if (!(firstarray[j][i-2].equals(secondarray[j][i-2]))) {
												if (!(firstarray[j+1][i+1].equals(secondarray[j+1][i+1]))) {
													if (!(firstarray[j+1][i-1].equals(secondarray[j+1][i-1]))) {
														if (!(firstarray[j-1][i-1].equals(secondarray[j-1][i-1]))) {
															if (!(firstarray[j-1][i+1].equals(secondarray[j-1][i+1]))) {
																answer = (8-j)*10 + (i+1);
																return answer;
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				} //close
				//bottom left second/inside corner
				if (j!=0 && i!=0 && j==6 && i!=6 && j!=7 && i!=7 && j!=1 && i==1) {
					if(!(firstarray[j][i].equals(secondarray[j][i]))) {
						if(!(firstarray[j+1][i].equals(secondarray[j+1][i]))) { 
							if (!(firstarray[j-1][i].equals(secondarray[j-1][i]))){
								if (!(firstarray[j-2][i].equals(secondarray[j-2][i]))) {
									if (!(firstarray[j][i+1].equals(secondarray[j][i+1]))) { 
										if (!(firstarray[j][i+2].equals(secondarray[j][i+2]))) {
											if (!(firstarray[j][i-1].equals(secondarray[j][i-1]))) {
												if (!(firstarray[j+1][i+1].equals(secondarray[j+1][i+1]))) {
													if (!(firstarray[j+1][i-1].equals(secondarray[j+1][i-1]))) {
														if (!(firstarray[j-1][i-1].equals(secondarray[j-1][i-1]))) {
															if (!(firstarray[j-1][i+1].equals(secondarray[j-1][i+1]))) {
																answer = (8-j)*10 + (i+1);
																return answer;
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				} //close
			}
		}
		return answer;
	}
}

