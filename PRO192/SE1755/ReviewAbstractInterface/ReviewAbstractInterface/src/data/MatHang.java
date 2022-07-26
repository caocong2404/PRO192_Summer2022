
package data;


public abstract class MatHang {
    
    protected String mMatHang, mTenHang;
    protected float mDonGia;
    protected int mSoLuong;

    public MatHang() {
    }

    public MatHang(String mMatHang, String mTenHang, float mDonGia, int mSoLuong) {
        this.mMatHang = mMatHang;
        this.mTenHang = mTenHang;
        this.mDonGia = mDonGia;
        this.mSoLuong = mSoLuong;
    }

    public String getmMatHang() {
        return mMatHang;
    }

    public void setmMatHang(String mMatHang) {
        this.mMatHang = mMatHang;
    }

    public String getmTenHang() {
        return mTenHang;
    }

    public void setmTenHang(String mTenHang) {
        this.mTenHang = mTenHang;
    }

    public float getmDonGia() {
        return mDonGia;
    }

    public void setmDonGia(float mDonGia) {
        this.mDonGia = mDonGia;
    }

    public int getmSoLuong() {
        return mSoLuong;
    }

    public void setmSoLuong(int mSoLuong) {
        this.mSoLuong = mSoLuong;
    }
    
    public abstract float ThanhTien();
    public abstract void XemChiTiet();
    
}
