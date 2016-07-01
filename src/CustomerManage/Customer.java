package CustomerManage;

import java.util.Date;

/**
 * Created by 10648 on 2016/7/1 0001.
 */
public class Customer {
 private int customer_number;
 private String customer_id;
 private Date customer_send_mac;
 private String customer_nature;
 private String customer_unit;
 private String customer_tel;
 private String customer_phone;
 private String customer_address;
 private String customer_postcode;
 private String customer_contacts;
 private String customer_email;

 public Customer() {
 }

 //全参数构造方法
 public Customer(int customer_number, String customer_id, Date customer_send_mac,
                 String customer_nature, String customer_unit, String customer_tel,
                 String customer_phone, String customer_address, String customer_postcode,
                 String customer_contacts, String customer_email) {
  this.customer_number = customer_number;
  this.customer_id = customer_id;
  this.customer_send_mac = customer_send_mac;
  this.customer_nature = customer_nature;
  this.customer_unit = customer_unit;
  this.customer_tel = customer_tel;
  this.customer_phone = customer_phone;
  this.customer_address = customer_address;
  this.customer_postcode = customer_postcode;
  this.customer_contacts = customer_contacts;
  this.customer_email = customer_email;
 }

 public int getCustomer_number() {
  return customer_number;
 }

 public void setCustomer_number(int customer_number) {
  this.customer_number = customer_number;
 }

 public String getCustomer_id() {
  return customer_id;
 }

 public void setCustomer_id(String customer_id) {
  this.customer_id = customer_id;
 }

 public Date getCustomer_send_mac() {
  return customer_send_mac;
 }

 public void setCustomer_send_mac(Date customer_send_mac) {
  this.customer_send_mac = customer_send_mac;
 }

 public String getCustomer_nature() {
  return customer_nature;
 }

 public void setCustomer_nature(String customer_nature) {
  this.customer_nature = customer_nature;
 }

 public String getCustomer_unit() {
  return customer_unit;
 }

 public void setCustomer_unit(String customer_unit) {
  this.customer_unit = customer_unit;
 }

 public String getCustomer_tel() {
  return customer_tel;
 }

 public void setCustomer_tel(String customer_tel) {
  this.customer_tel = customer_tel;
 }

 public String getCustomer_phone() {
  return customer_phone;
 }

 public void setCustomer_phone(String customer_phone) {
  this.customer_phone = customer_phone;
 }

 public String getCustomer_address() {
  return customer_address;
 }

 public void setCustomer_address(String customer_address) {
  this.customer_address = customer_address;
 }

 public String getCustomer_postcode() {
  return customer_postcode;
 }

 public void setCustomer_postcode(String customer_postcode) {
  this.customer_postcode = customer_postcode;
 }

 public String getCustomer_contacts() {
  return customer_contacts;
 }

 public void setCustomer_contacts(String customer_contacts) {
  this.customer_contacts = customer_contacts;
 }

 public String getCustomer_email() {
  return customer_email;
 }

 public void setCustomer_email(String customer_email) {
  this.customer_email = customer_email;
 }
}
