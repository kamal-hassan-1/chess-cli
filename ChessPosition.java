public class ChessPosition {
    private int file;
    private int rank;

    ChessPosition(int file, int rank) {
        this.setPosition(file, rank);
    }

    void setPosition(int file, int rank) {
        if (!isValidPosition(file, rank)) {
            throw new IllegalArgumentException("ChessPosition: Invalid position specified.");
        }

        this.file = file;
        this.rank = rank;
    }

    static boolean isValidPosition(int file, int rank) {
        if (file < 1 || file > 8) return false;
        if (rank < 1 || rank > 8) return false;
        return true;
    }

    int getFile() { return this.file; }
    int getRank() { return this.rank; }

    void setFile(int file) { this.setPosition(file, this.rank); }
    void setRank(int rank) { this.setPosition(this.file, rank); }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Same reference
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Null or different class
        }
        ChessPosition that = (ChessPosition) obj;
        return this.file == that.file && this.rank == that.rank; // Compare file and rank
    }
    public boolean equals(int file, int rank) {
        return (this.file == file && this.rank == rank);
    }
}
