package rechorder;

public class Chords{
	public static int A = 0;
	public static int A_M = 1;
	public static int A_6 = 2;
	public static int A_7 = 3;
	public static int A_9 = 4;
	public static int A_M_6 = 5;
	public static int A_M_7 = 6;
	public static int A_MAJ_7 = 7;
	public static int A_DIM = 8;
	public static int A_AUG = 9;
	public static int A_SUS = 10;
	
	public static int B_FLAT = 11;
	public static int B_FLAT_M = 12;
	public static int B_FLAT_6 = 13;
	public static int B_FLAT_7 = 14;
	public static int B_FLAT_9 = 15;
	public static int B_FLAT_M_6 = 16;
	public static int B_FLAT_M_7 = 17;
	public static int B_FLAT_MAJ_7 = 18;
	public static int B_FLAT_DIM = 19;
	public static int B_FLAT_AUG = 20;
	public static int B_FLAT_SUS = 21;
	
	public static int B = 22;
	public static int B_M = 23;
	public static int B_6 = 24;
	public static int B_7 = 25;
	public static int B_9 = 26;
	public static int B_M_6 = 27;
	public static int B_M_7 = 28;
	public static int B_MAJ_7 = 29;
	public static int B_DIM = 30;
	public static int B_AUG = 31;
	public static int B_SUS = 32;
	
	public static int C = 33;
	public static int C_M = 34;
	public static int C_6 = 35;
	public static int C_7 = 36;
	public static int C_9 = 37;
	public static int C_M_6 = 38;
	public static int C_M_7 = 39;
	public static int C_MAJ_7 = 40;
	public static int C_DIM = 41;
	public static int C_AUG = 42;
	public static int C_SUS = 43;
	
	public static int D_FLAT = 44;
	public static int C_SHARP_M = 45;
	public static int D_FLAT_6 = 46;
	public static int D_FLAT_7 = 47;
	public static int D_FLAT_9 = 48;
	public static int C_SHARP_M_6 = 49;
	public static int C_SHARP_M_7 = 50;
	public static int D_FLAT_MAJ_7 = 51;
	public static int C_SHARP_DIM = 52;
	public static int D_FLAT_AUG = 53;
	public static int D_FLAT_SUS = 54;
	
	public static int D = 55;
	public static int D_M = 56;
	public static int D_6 = 57;
	public static int D_7 = 58;
	public static int D_9 = 59;
	public static int D_M_6 = 60;
	public static int D_M_7 = 61;
	public static int D_MAJ_7 = 62;
	public static int D_DIM = 63;
	public static int D_AUG = 64;
	public static int D_SUS = 65;
	
	public static int E_FLAT = 66;
	public static int E_FLAT_M = 67;
	public static int E_FLAT_6 = 68;
	public static int E_FLAT_7 = 69;
	public static int E_FLAT_9 = 70;
	public static int E_FLAT_M_6 = 71;
	public static int E_FLAT_M_7 = 72;
	public static int E_FLAT_MAJ_7 = 73;
	public static int E_FLAT_DIM = 74;
	public static int E_FLAT_AUG = 75;
	public static int E_FLAT_SUS = 76;
	
	public static int E = 77;
	public static int E_M = 78;
	public static int E_6 = 79;
	public static int E_7 = 80;
	public static int E_9 = 81;
	public static int E_M_6 = 82;
	public static int E_M_7 = 83;
	public static int E_MAJ_7 = 84;
	public static int E_DIM = 85;
	public static int E_AUG = 86;
	public static int E_SUS = 87;
	
	public static int F = 88;
	public static int F_M = 89;
	public static int F_6 = 90;
	public static int F_7 = 91;
	public static int F_9 = 92;
	public static int F_M_6 = 93;
	public static int F_M_7 = 94;
	public static int F_MAJ_7 = 95;
	public static int F_DIM = 96;
	public static int F_AUG = 97;
	public static int F_SUS = 98;
	
	public static int F_SHARP = 99;
	public static int F_SHARP_M = 100;
	public static int G_FLAT_6 = 101;
	public static int F_SHARP_7 = 102;
	public static int F_SHARP_9 = 103;
	public static int F_SHARP_M_6 = 104;
	public static int F_SHARP_M_7 = 105;
	public static int G_FLAT_MAJ_7 = 106;
	public static int F_SHARP_DIM = 107;
	public static int G_FLAT_AUG = 108;
	public static int G_FLAT_SUS = 109;
	
	public static int G = 110;
	public static int G_M = 111;
	public static int G_6 = 112;
	public static int G_7 = 113;
	public static int G_9 = 114;
	public static int G_M_6 = 115;
	public static int G_M_7 = 116;
	public static int G_MAJ_7 = 117;
	public static int G_DIM = 118;
	public static int G_AUG = 119;
	public static int G_SUS = 120;
	
	public static int A_FLAT = 121;
	public static int G_SHARP_M = 122;
	public static int A_FLAT_6 = 123;
	public static int A_FLAT_7 = 124;
	public static int A_FLAT_9 = 125;
	public static int G_SHARP_M_6 = 126;
	public static int G_SHARP_M_7 = 127;
	public static int A_FLAT_MAJ_7 = 128;
	public static int G_SHARP_DIM = 129;
	public static int A_FLAT_AUG = 130;
	public static int A_FLAT_SUS = 131;
	
	public static int INVALID = 999;
	
	public static int chordNumber(String chord){
		if(chord.charAt(0) == 'A'){
			switch(chord){
			case "A":
				return Chords.A;
			case "Am":
				return Chords.A_M;
			case "A6":
				return Chords.A_6;
			case "A7":
				return Chords.A_7;
			case "A9":
				return Chords.A_9;
			case "Am6":
				return Chords.A_M_6;
			case "Am7":
				return Chords.A_M_7;
			case "Amaj7":
				return Chords.A_MAJ_7;
			case "Adim":
				return Chords.A_DIM;
			case "Aaug":
				return Chords.A_AUG;
			case "A+":
				return Chords.A_AUG;
			case "Asus":
				return Chords.A_SUS;
			case "A#":
				return Chords.B_FLAT;
			case "A#m":
				return Chords.B_FLAT_M;
			case "A#6":
				return Chords.B_FLAT_6;
			case "A#7":
				return Chords.B_FLAT_7;
			case "A#9":
				return Chords.B_FLAT_9;
			case "A#m6":
				return Chords.B_FLAT_M_6;
			case "A#m7":
				return Chords.B_FLAT_M_7;
			case "A#maj7":
				return Chords.B_FLAT_MAJ_7;
			case "A#dim":
				return Chords.B_FLAT_DIM;
			case "A#aug":
				return Chords.B_FLAT_AUG;
			case "A#+":
				return Chords.B_FLAT_AUG;
			case "A#sus":
				return Chords.B_FLAT_SUS;
			case "Ab":
				return Chords.A_FLAT;
			case "Abm":
				return Chords.G_SHARP_M;
			case "Ab6":
				return Chords.A_FLAT_6;
			case "Ab7":
				return Chords.A_FLAT_7;
			case "Ab9":
				return Chords.A_FLAT_9;
			case "Abm6":
				return Chords.G_SHARP_M_6;
			case "Abm7":
				return Chords.G_SHARP_M_7;
			case "Abmaj7":
				return Chords.A_FLAT_MAJ_7;
			case "Abdim":
				return Chords.G_SHARP_DIM;
			case "Abaug":
				return Chords.A_FLAT_AUG;
			case "Ab+":
				return Chords.A_FLAT_AUG;
			case "Absus":
				return Chords.A_FLAT_SUS;
			}
		}
		else if(chord.charAt(0) == 'B'){
			switch(chord){
			case "B":
				return Chords.B;
			case "Bm":
				return Chords.B_M;
			case "B6":
				return Chords.B_6;
			case "B7":
				return Chords.B_7;
			case "B9":
				return Chords.B_9;
			case "Bm6":
				return Chords.B_M_6;
			case "Bm7":
				return Chords.B_M_7;
			case "Bmaj7":
				return Chords.B_MAJ_7;
			case "Bdim":
				return Chords.B_DIM;
			case "Baug":
				return Chords.B_AUG;
			case "B+":
				return Chords.B_AUG;
			case "Bsus":
				return Chords.B_SUS;
			case "B#":
				return Chords.C;
			case "B#m":
				return Chords.C_M;
			case "B#6":
				return Chords.C_6;
			case "B#7":
				return Chords.C_7;
			case "B#9":
				return Chords.C_9;
			case "B#m6":
				return Chords.C_M_6;
			case "B#m7":
				return Chords.C_M_7;
			case "B#maj7":
				return Chords.C_MAJ_7;
			case "B#dim":
				return Chords.C_DIM;
			case "B#aug":
				return Chords.C_AUG;
			case "B#+":
				return Chords.C_AUG;
			case "B#sus":
				return Chords.C_SUS;
			case "Bb":
				return Chords.B_FLAT;
			case "Bbm":
				return Chords.B_FLAT_M;
			case "Bb6":
				return Chords.B_FLAT_6;
			case "Bb7":
				return Chords.B_FLAT_7;
			case "Bb9":
				return Chords.B_FLAT_9;
			case "Bbm6":
				return Chords.B_FLAT_M_6;
			case "Bbm7":
				return Chords.B_FLAT_M_7;
			case "Bbmaj7":
				return Chords.B_FLAT_MAJ_7;
			case "Bbdim":
				return Chords.B_FLAT_DIM;
			case "Bbaug":
				return Chords.B_FLAT_AUG;
			case "Bb+":
				return Chords.B_FLAT_AUG;
			case "Bbsus":
				return Chords.B_FLAT_SUS;
			}
		}
		else if(chord.charAt(0) == 'C'){
			switch(chord){
			case "C":
				return Chords.C;
			case "Cm":
				return Chords.C_M;
			case "C6":
				return Chords.C_6;
			case "C7":
				return Chords.C_7;
			case "C9":
				return Chords.C_9;
			case "Cm6":
				return Chords.C_M_6;
			case "Cm7":
				return Chords.C_M_7;
			case "Cmaj7":
				return Chords.C_MAJ_7;
			case "Cdim":
				return Chords.C_DIM;
			case "Caug":
				return Chords.C_AUG;
			case "C+":
				return Chords.C_AUG;
			case "Csus":
				return Chords.C_SUS;
			case "C#":
				return Chords.D_FLAT;
			case "C#m":
				return Chords.C_SHARP_M;
			case "C#6":
				return Chords.D_FLAT_6;
			case "C#7":
				return Chords.D_FLAT_7;
			case "C#9":
				return Chords.D_FLAT_9;
			case "C#m6":
				return Chords.C_SHARP_M_6;
			case "C#m7":
				return Chords.C_SHARP_M_7;
			case "C#maj7":
				return Chords.D_FLAT_MAJ_7;
			case "C#dim":
				return Chords.C_SHARP_DIM;
			case "C#aug":
				return Chords.D_FLAT_AUG;
			case "C#+":
				return Chords.D_FLAT_AUG;
			case "C#sus":
				return Chords.D_FLAT_SUS;
			case "Cb":
				return Chords.B;
			case "Cbm":
				return Chords.B_M;
			case "Cb6":
				return Chords.B_6;
			case "Cb7":
				return Chords.B_7;
			case "Cb9":
				return Chords.B_9;
			case "Cbm6":
				return Chords.B_M_6;
			case "Cbm7":
				return Chords.B_M_7;
			case "Cbmaj7":
				return Chords.B_MAJ_7;
			case "Cbdim":
				return Chords.B_DIM;
			case "Cbaug":
				return Chords.B_AUG;
			case "Cb+":
				return Chords.B_AUG;
			case "Cbsus":
				return Chords.B_SUS;
			}
		}
		else if(chord.charAt(0) == 'D'){
			switch(chord){
			case "D":
				return Chords.D;
			case "Dm":
				return Chords.D_M;
			case "D6":
				return Chords.D_6;
			case "D7":
				return Chords.D_7;
			case "D9":
				return Chords.D_9;
			case "Dm6":
				return Chords.D_M_6;
			case "Dm7":
				return Chords.D_M_7;
			case "Dmaj7":
				return Chords.D_MAJ_7;
			case "Ddim":
				return Chords.D_DIM;
			case "Daug":
				return Chords.D_AUG;
			case "D+":
				return Chords.D_AUG;
			case "Dsus":
				return Chords.D_SUS;
			case "D#":
				return Chords.E_FLAT;
			case "D#m":
				return Chords.E_FLAT_M;
			case "D#6":
				return Chords.E_FLAT_6;
			case "D#7":
				return Chords.E_FLAT_7;
			case "D#9":
				return Chords.E_FLAT_9;
			case "D#m6":
				return Chords.E_FLAT_M_6;
			case "D#m7":
				return Chords.E_FLAT_M_7;
			case "D#maj7":
				return Chords.E_FLAT_MAJ_7;
			case "D#dim":
				return Chords.E_FLAT_DIM;
			case "D#aug":
				return Chords.E_FLAT_AUG;
			case "D#+":
				return Chords.E_FLAT_AUG;
			case "D#sus":
				return Chords.E_FLAT_SUS;
			case "Db":
				return Chords.D_FLAT;
			case "Dbm":
				return Chords.C_SHARP_M;
			case "Db6":
				return Chords.D_FLAT_6;
			case "Db7":
				return Chords.D_FLAT_7;
			case "Db9":
				return Chords.D_FLAT_9;
			case "Dbm6":
				return Chords.C_SHARP_M_6;
			case "Dbm7":
				return Chords.C_SHARP_M_7;
			case "Dbmaj7":
				return Chords.D_FLAT_MAJ_7;
			case "Dbdim":
				return Chords.C_SHARP_DIM;
			case "Dbaug":
				return Chords.D_FLAT_AUG;
			case "Db+":
				return Chords.D_FLAT_AUG;
			case "Dbsus":
				return Chords.D_FLAT_SUS;
			}
		}
		else if(chord.charAt(0) == 'E'){
			switch(chord){
			case "E":
				return Chords.E;
			case "Em":
				return Chords.E_M;
			case "E6":
				return Chords.E_6;
			case "E7":
				return Chords.E_7;
			case "E9":
				return Chords.E_9;
			case "Em6":
				return Chords.E_M_6;
			case "Em7":
				return Chords.E_M_7;
			case "Emaj7":
				return Chords.E_MAJ_7;
			case "Edim":
				return Chords.E_DIM;
			case "Eaug":
				return Chords.E_AUG;
			case "E+":
				return Chords.E_AUG;
			case "Esus":
				return Chords.E_SUS;
			case "E#":
				return Chords.F;
			case "E#m":
				return Chords.F_M;
			case "E#6":
				return Chords.F_6;
			case "E#7":
				return Chords.F_7;
			case "E#9":
				return Chords.F_9;
			case "E#m6":
				return Chords.F_M_6;
			case "E#m7":
				return Chords.F_M_7;
			case "E#maj7":
				return Chords.F_MAJ_7;
			case "E#dim":
				return Chords.F_DIM;
			case "E#aug":
				return Chords.F_AUG;
			case "E#+":
				return Chords.F_AUG;
			case "E#sus":
				return Chords.F_SUS;
			case "Eb":
				return Chords.E_FLAT;
			case "Ebm":
				return Chords.E_FLAT_M;
			case "Eb6":
				return Chords.E_FLAT_6;
			case "Eb7":
				return Chords.E_FLAT_7;
			case "Eb9":
				return Chords.E_FLAT_9;
			case "Ebm6":
				return Chords.E_FLAT_M_6;
			case "Ebm7":
				return Chords.E_FLAT_M_7;
			case "Ebmaj7":
				return Chords.E_FLAT_MAJ_7;
			case "Ebdim":
				return Chords.E_FLAT_DIM;
			case "Ebaug":
				return Chords.E_FLAT_AUG;
			case "Eb+":
				return Chords.E_FLAT_AUG;
			case "Ebsus":
				return Chords.E_FLAT_SUS;
			}
		}
		else if(chord.charAt(0) == 'F'){
			switch(chord){
			case "F":
				return Chords.F;
			case "Fm":
				return Chords.F_M;
			case "F6":
				return Chords.F_6;
			case "F7":
				return Chords.F_7;
			case "F9":
				return Chords.F_9;
			case "Fm6":
				return Chords.F_M_6;
			case "Fm7":
				return Chords.F_M_7;
			case "Fmaj7":
				return Chords.F_MAJ_7;
			case "Fdim":
				return Chords.F_DIM;
			case "Faug":
				return Chords.F_AUG;
			case "F+":
				return Chords.F_AUG;
			case "Fsus":
				return Chords.F_SUS;
			case "F#":
				return Chords.F_SHARP;
			case "F#m":
				return Chords.F_SHARP_M;
			case "F#6":
				return Chords.G_FLAT_6;
			case "F#7":
				return Chords.F_SHARP_7;
			case "F#9":
				return Chords.F_SHARP_9;
			case "F#m6":
				return Chords.F_SHARP_M_6;
			case "F#m7":
				return Chords.F_SHARP_M_7;
			case "F#maj7":
				return Chords.G_FLAT_MAJ_7;
			case "F#dim":
				return Chords.F_SHARP_DIM;
			case "F#aug":
				return Chords.G_FLAT_AUG;
			case "F#+":
				return Chords.G_FLAT_AUG;
			case "F#sus":
				return Chords.G_FLAT_SUS;
			case "Fb":
				return Chords.E;
			case "Fbm":
				return Chords.E_M;
			case "Fb6":
				return Chords.E_6;
			case "Fb7":
				return Chords.E_7;
			case "Fb9":
				return Chords.E_9;
			case "Fbm6":
				return Chords.E_M_6;
			case "Fbm7":
				return Chords.E_M_7;
			case "Fbmaj7":
				return Chords.E_MAJ_7;
			case "Fbdim":
				return Chords.E_DIM;
			case "Fbaug":
				return Chords.E_AUG;
			case "Fb+":
				return Chords.E_AUG;
			case "Fbsus":
				return Chords.E_SUS;
			}
		}
		else if(chord.charAt(0) == 'G'){
			switch(chord){
			case "G":
				return Chords.G;
			case "Gm":
				return Chords.G_M;
			case "G6":
				return Chords.G_6;
			case "G7":
				return Chords.G_7;
			case "G9":
				return Chords.G_9;
			case "Gm6":
				return Chords.G_M_6;
			case "Gm7":
				return Chords.G_M_7;
			case "Gmaj7":
				return Chords.G_MAJ_7;
			case "Gdim":
				return Chords.G_DIM;
			case "Gaug":
				return Chords.G_AUG;
			case "G+":
				return Chords.G_AUG;
			case "Gsus":
				return Chords.G_SUS;
			case "G#":
				return Chords.A_FLAT;
			case "G#m":
				return Chords.G_SHARP_M;
			case "G#6":
				return Chords.A_FLAT_6;
			case "G#7":
				return Chords.A_FLAT_7;
			case "G#9":
				return Chords.A_FLAT_9;
			case "G#m6":
				return Chords.G_SHARP_M_6;
			case "G#m7":
				return Chords.G_SHARP_M_7;
			case "G#maj7":
				return Chords.A_FLAT_MAJ_7;
			case "G#dim":
				return Chords.G_SHARP_DIM;
			case "G#aug":
				return Chords.A_FLAT_AUG;
			case "G#+":
				return Chords.A_FLAT_AUG;
			case "G#sus":
				return Chords.A_FLAT_SUS;
			case "Gb":
				return Chords.F_SHARP;
			case "Gbm":
				return Chords.F_SHARP_M;
			case "Gb6":
				return Chords.G_FLAT_6;
			case "Gb7":
				return Chords.F_SHARP_7;
			case "Gb9":
				return Chords.F_SHARP_9;
			case "Gbm6":
				return Chords.F_SHARP_M_6;
			case "Gbm7":
				return Chords.F_SHARP_M_7;
			case "Gbmaj7":
				return Chords.G_FLAT_MAJ_7;
			case "Gbdim":
				return Chords.F_SHARP_DIM;
			case "Gbaug":
				return Chords.G_FLAT_AUG;
			case "Gb+":
				return Chords.G_FLAT_AUG;
			case "Gbsus":
				return Chords.G_FLAT_SUS;
			}
		}
		return INVALID;
	}
}