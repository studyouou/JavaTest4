#!/bin/bash
curl -X GET http://localhost:18080/pageHelper?page=10\&pageSize=10
echo
echo
echo
sleep 2
echo `curl -XPUT http://localhost:18080/customer/addCustomer?firstName=ou\&lastName=gen\&email=304489914@qq.com\&address=23%20Workhaven%20Lane` > id
echo
echo
echo
sleep 2
idd=` cat  id | awk -F':' '{print $4}' |awk -F'}' '{print $1}'`
curl -XPOST http://localhost:18080/customer/$idd/update?firstName=ou\&lastName=gen\&email=304489914@qq.com\&address=23%20Workhaven%20Lane
echo
echo
echo
sleep 2
curl -X DELETE http://localhost:18080//customer/$idd/delete
