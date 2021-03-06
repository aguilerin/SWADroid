/*
 *  This file is part of SWADroid.
 *
 *  Copyright (C) 2010 Juan Miguel Boyero Corral <juanmi1982@gmail.com>
 *
 *  SWADroid is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  SWADroid is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with SWADroid.  If not, see <http://www.gnu.org/licenses/>.
 */
package es.ugr.swad.swadroid.model;

import java.util.Hashtable;

import org.ksoap2.serialization.PropertyInfo;

/**
 * Class for store a notification
 * @author Juan Miguel Boyero Corral <juanmi1982@gmail.com> *
 */
public class SWADNotification extends Model {
	/**
	 * Notification type
	 */
	private String eventType;
	/**
	 * Notification timestamp
	 */
	private long eventTime;
	/**
	 * Sender first surname
	 */
	private String userSurname1;
	/**
	 * Sender second surname
	 */
	private String userSurname2;
	/**
	 * Sender first name
	 */
	private String userFirstName;
	/**
	 * Notification location
	 */
	private String location;
	/**
	 * Notification summary
	 */
	private String summary;
	/**
	 * Notification status
	 */
	private int status;
	/**
	 * Notification content
	 */
	private String content;
	private static PropertyInfo PI_id = new PropertyInfo();
	private static PropertyInfo PI_eventType = new PropertyInfo();
	private static PropertyInfo PI_eventTime = new PropertyInfo();
	private static PropertyInfo PI_userSurname1 = new PropertyInfo();
	private static PropertyInfo PI_userSurname2 = new PropertyInfo();
	private static PropertyInfo PI_userFirstName = new PropertyInfo();
	private static PropertyInfo PI_location = new PropertyInfo();
	private static PropertyInfo PI_summary = new PropertyInfo();
	private static PropertyInfo PI_status = new PropertyInfo();
	private static PropertyInfo PI_content = new PropertyInfo();
	@SuppressWarnings("unused")
	private static PropertyInfo[] PI_PROP_ARRAY =
{
		PI_id,
		PI_eventType,
		PI_eventTime,
		PI_userSurname1,
		PI_userSurname2,
		PI_userFirstName,
		PI_location,
		PI_summary,
		PI_status,
		PI_content
};

	/**
	 * @param id Notification id
	 * @param eventType Notification type
	 * @param eventTime Notification timestamp
	 * @param userSurname1 Sender first surname
	 * @param userSurname2 Sender second surname
	 * @param userFirstName Sender first name
	 * @param location Notification location
	 * @param summary Notification summary
	 * @param status Notification summary
	 */
	public SWADNotification(long id, String eventType, long eventTime,
			String userSurname1, String userSurname2, String userFirstName,
			String location, String summary, int status, String content) {

		super(id);
		this.eventType = eventType;
		this.eventTime = eventTime;
		this.userSurname1 = userSurname1;
		this.userSurname2 = userSurname2;
		this.userFirstName = userFirstName;
		this.location = location;
		this.summary = summary;
		this.status = status;
		this.content = content;
	}

	/**
	 * Gets notification type
	 * @return Notification type
	 */
	public String getEventType() {
		return eventType;
	}

	/**
	 * Sets notification type
	 * @param eventType Notification type
	 */
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	/**
	 * Gets notification timestamp
	 * @return Notification timestamp
	 */
	public long getEventTime() {
		return eventTime;
	}

	/**
	 * Sets notification timestamp
	 * @param eventTime Notification timestamp
	 */
	public void setEventTime(int eventTime) {
		this.eventTime = eventTime;
	}

	/**
	 * Gets sender first surname
	 * @return Sender first surname
	 */
	public String getUserSurname1() {
		return userSurname1;
	}

	/**
	 * Sets sender first surname
	 * @param userSurname1 Sender first surname
	 */
	public void setUserSurname1(String userSurname1) {
		this.userSurname1 = userSurname1;
	}

	/**
	 * Gets sender second surname
	 * @return Sender second surname
	 */
	public String getUserSurname2() {
		return userSurname2;
	}

	/**
	 * Sets sender second surname
	 * @param userSurname2 Sender second surname
	 */
	public void setUserSurname2(String userSurname2) {
		this.userSurname2 = userSurname2;
	}

	/**
	 * Gets sender first name
	 * @return Sender first name
	 */
	public String getUserFirstName() {
		return userFirstName;
	}

	/**
	 * Sets sender first name
	 * @param userFirstName Sender first name
	 */
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	/**
	 * Gets notification location
	 * @return Notification location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * Sets notification location
	 * @param location Notification location
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * Gets notification summary
	 * @return Notification summary
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * Sets notification summary
	 * @param summary Notification summary
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}	

	/**
	 * Gets notification status
	 * @return Notification status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * Sets notification status
	 * @param status Notification status
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * Gets notification content
	 * @return Notification content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * Sets notification content
	 * @param content notification content
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + (int) (eventTime ^ (eventTime >>> 32));
		result = prime * result
				+ ((eventType == null) ? 0 : eventType.hashCode());
		result = prime * result
				+ ((location == null) ? 0 : location.hashCode());
		result = prime * result + status;
		result = prime * result + ((summary == null) ? 0 : summary.hashCode());
		result = prime * result
				+ ((userFirstName == null) ? 0 : userFirstName.hashCode());
		result = prime * result
				+ ((userSurname1 == null) ? 0 : userSurname1.hashCode());
		result = prime * result
				+ ((userSurname2 == null) ? 0 : userSurname2.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Notification [eventType=" + eventType + ", eventTime="
				+ eventTime + ", userSurname1=" + userSurname1
				+ ", userSurname2=" + userSurname2 + ", userFirstName="
				+ userFirstName + ", location=" + location + ", summary="
				+ summary + ", status=" + status + ", content=" + content + "]";
	}

	/* (non-Javadoc)
	 * @see org.ksoap2.serialization.KvmSerializable#getProperty(int)
	 */
	public Object getProperty(int param) {
		Object object = null;
		switch(param)
		{
		case 0 : object = this.getId();break;
		case 1 : object = eventType;break;
		case 2 : object = eventTime;break;
		case 3 : object = userSurname1;break;
		case 4 : object = userSurname2;break;
		case 5 : object = userFirstName;break;
		case 6 : object = location;break;
		case 7 : object = summary;break;
		case 8 : object = status;break;
		case 9 : object = content;break;
		}

		return object;
	}

	/* (non-Javadoc)
	 * @see org.ksoap2.serialization.KvmSerializable#getPropertyCount()
	 */
	public int getPropertyCount() {
		return 9;
	}

	/* (non-Javadoc)
	 * @see org.ksoap2.serialization.KvmSerializable#getPropertyInfo(int, java.util.Hashtable, org.ksoap2.serialization.PropertyInfo)
	 */
	public void getPropertyInfo(int param, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo propertyInfo) {
		switch(param){
		case 0:
			propertyInfo.type = PropertyInfo.LONG_CLASS;
			propertyInfo.name = "id";
			break;   
		case 1:
			propertyInfo.type = PropertyInfo.STRING_CLASS;
			propertyInfo.name = "eventType";
			break;    
		case 2:
			propertyInfo.type = PropertyInfo.LONG_CLASS;
			propertyInfo.name = "eventTime";
			break;    
		case 3:
			propertyInfo.type = PropertyInfo.STRING_CLASS;
			propertyInfo.name = "userSurname1";
			break;    
		case 4:
			propertyInfo.type = PropertyInfo.STRING_CLASS;
			propertyInfo.name = "userSurname2";
			break;    
		case 5:
			propertyInfo.type = PropertyInfo.STRING_CLASS;
			propertyInfo.name = "userFirstName";
			break;    
		case 6:
			propertyInfo.type = PropertyInfo.STRING_CLASS;
			propertyInfo.name = "location";
			break;    
		case 7:
			propertyInfo.type = PropertyInfo.STRING_CLASS;
			propertyInfo.name = "summary";
			break;
		case 8:
			propertyInfo.type = PropertyInfo.INTEGER_CLASS;
			propertyInfo.name = "status";
			break;
		case 9:
			propertyInfo.type = PropertyInfo.STRING_CLASS;
			propertyInfo.name = "content";
			break;
		}
	}

	/* (non-Javadoc)
	 * @see org.ksoap2.serialization.KvmSerializable#setProperty(int, java.lang.Object)
	 */
	public void setProperty(int param, Object obj) {
		switch(param)
		{
		case 0  : this.setId((Long)obj); break;
		case 1  : eventType = (String)obj; break;
		case 2  : eventTime = (Long)obj; break;
		case 3  : userSurname1 = (String)obj; break;
		case 4  : userSurname2 = (String)obj; break;
		case 5  : userFirstName = (String)obj; break;
		case 6  : location = (String)obj; break;
		case 7  : summary = (String)obj; break;
		case 8  : status = (Integer)obj; break;
		case 9  : content = (String)obj; break;
		}    
	}
}
