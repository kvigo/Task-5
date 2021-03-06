package builder;

import entity.Voucher;
import exception.VoucherSetBuildingException;

import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

public abstract class AbstractVoucherBuilder {
    Set<Voucher> vouchers;

    AbstractVoucherBuilder() {
        vouchers = new HashSet<>();
    }

    public abstract void buildSetVouchers(InputStream fileInputStream) throws VoucherSetBuildingException;

    public Set<Voucher> getVouchers() {
        return vouchers;
    }
}
