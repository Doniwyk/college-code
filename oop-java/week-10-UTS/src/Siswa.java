public class Siswa {
    private final String nama;
    private int rankTest;
    private boolean isPassingGrade;

    public Siswa(String nama) {
        this.nama = nama;
        this.isPassingGrade = false;
    }

    public void lulus() {
        this.isPassingGrade = true;
    }

    public boolean isPassingGrade() {
        return isPassingGrade;
    }

    public String getNama() {
        return nama;
    }

    public void setRankTest(int rankTest) {
        this.rankTest = rankTest;
    }

    public int getRankTest() {
        return rankTest;
    }

    public boolean isLulus() {
        return getRankTest() < 1000;
    }

}
