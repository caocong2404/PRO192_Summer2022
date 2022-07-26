package data;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Milk extends MatHang {
    SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
    private Date mNgaySanXuat, mHanSudung;
    private String mDonViTinh; //(thung)

    public Milk() {
    }

    public Milk(Date mNgaySanXuat, Date mHanSudung, String mDonViTinh, String mMatHang, String mTenHang, float mDonGia, int mSoLuong) {
        super(mMatHang, mTenHang, mDonGia, mSoLuong);
        this.mNgaySanXuat = mNgaySanXuat;
        this.mHanSudung = mHanSudung;
        this.mDonViTinh = mDonViTinh;
    }

    public Date getmNgaySanXuat() {
        return mNgaySanXuat;
    }

    public void setmNgaySanXuat(Date mNgaySanXuat) {
        this.mNgaySanXuat = mNgaySanXuat;
    }

    public Date getmHanSudung() {
        return mHanSudung;
    }

    public void setmHanSudung(Date mHanSudung) {
        this.mHanSudung = mHanSudung;
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
       System.out.printf("|%-6s|%-10s|%-10.1f|%-6d|%-10.1f|", mMatHang, mTenHang, mDonGia, mSoLuong, ThanhTien());
       System.out.print(mDonViTinh + "|NSX: " + date.format(mNgaySanXuat) + " |HSD: " + date.format(mHanSudung));
    }

}
