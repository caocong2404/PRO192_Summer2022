
package data;


public class Socola extends MatHang{
    
    private String mMauSac, mDonViTinh;

    public Socola() {
    }

    public Socola(String mMauSac, String mDonViTinh, String mMatHang, String mTenHang, float mDonGia, int mSoLuong) {
        super(mMatHang, mTenHang, mDonGia, mSoLuong);
        this.mMauSac = mMauSac;
        this.mDonViTinh = mDonViTinh;
    }

    public String getmMauSac() {
        return mMauSac;
    }

    public void setmMauSac(String mMauSac) {
        this.mMauSac = mMauSac;
    }

    public String getmDonViTinh() {
        return mDonViTinh;
    }

    public void setmDonViTinh(String mDonViTinh) {
        this.mDonViTinh = mDonViTinh;
    }
    
    @Override
    public float ThanhTien() {
        return mSoLuong * mDonGia;
    }

    @Override
    public void XemChiTiet() {
        System.out.printf("|%-6s|%-10s|%-10.1f|%-6d|%-10.1f|%-6s|%-6s\n", mMatHang, mTenHang, mDonGia, mSoLuong, ThanhTien(), mDonViTinh, mMauSac) ;
    }
    
    
    
    
}
