package jp.oops.kazu.kkb.dao.entity;

import java.util.Date;

public class Record {
    private long id;
    private long userId;
    private Date entryDate;
    private long accountId;
    private long itemId;
    private boolean balanceFlag;
    private long amount;
    private String memo;
    private Date created;
    private Date modified;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getUserId() {
        return userId;
    }
    public void setUserId(long userId) {
        this.userId = userId;
    }
    public Date getEntryDate() {
        return entryDate;
    }
    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }
    public long getAccountId() {
        return accountId;
    }
    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }
    public long getItemId() {
        return itemId;
    }
    public void setItemId(long itemId) {
        this.itemId = itemId;
    }
    public boolean isBalanceFlag() {
        return balanceFlag;
    }
    public void setBalanceFlag(boolean balanceFlag) {
        this.balanceFlag = balanceFlag;
    }
    public long getAmount() {
        return amount;
    }
    public void setAmount(long amount) {
        this.amount = amount;
    }
    public String getMemo() {
        return memo;
    }
    public void setMemo(String memo) {
        this.memo = memo;
    }
    public Date getCreated() {
        return created;
    }
    public void setCreated(Date created) {
        this.created = created;
    }
    public Date getModified() {
        return modified;
    }
    public void setModified(Date modified) {
        this.modified = modified;
    }
}
