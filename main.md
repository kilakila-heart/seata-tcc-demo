## 启动步骤
1. resources/database-sql：初始化数据库
2. eureka-server：运行注册中心
3. resources/seata-server：下载、安装、配置、启动 seata server服务：在另一个项目中*[seata-server](https://github.com/kilakila-heart/incubator-seata/tree/master)*. ，注意要seata-server注册到eureka启动
4. account-service：运行用户账户服务
5. storage-service：运行商品库存服务
6. order-service：运行订单服务
7. 测试：通过postman等工具，调用 order-server 的下订单接口

```sh
curl --location 'http://localhost:8083/order/create' \
--header 'Content-Type: application/json' \
--data '{
    "userId": 1,
    "productId": 2,
    "amount": 2,
    "money": 6.5
}'
```