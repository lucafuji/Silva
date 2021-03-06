package com.wzfuji.db.entity;

// Generated May 9, 2012 3:14:09 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ItemClusterId generated by hbm2java
 */
@Embeddable
public class ItemClusterId implements java.io.Serializable {

	private int userId;
	private int itemId;

	public ItemClusterId() {
	}

	public ItemClusterId(int userId, int itemId) {
		this.userId = userId;
		this.itemId = itemId;
	}

	@Column(name = "userId", nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Column(name = "itemId", nullable = false)
	public int getItemId() {
		return this.itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ItemClusterId))
			return false;
		ItemClusterId castOther = (ItemClusterId) other;

		return (this.getUserId() == castOther.getUserId())
				&& (this.getItemId() == castOther.getItemId());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getUserId();
		result = 37 * result + this.getItemId();
		return result;
	}

}
