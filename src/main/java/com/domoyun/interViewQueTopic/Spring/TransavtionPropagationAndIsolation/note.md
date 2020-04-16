
```java
/**
	 * 事务的属性：
	 * 	1.★propagation：用来设置事务的传播行为
	 * 		事务的传播行为：一个方法运行在了一个开启了事务的方法中时，当前方法是使用原来的事务还是开启一个新的事务
	 * 		-Propagation.REQUIRED：默认值，使用原来的事务
	 * 		-Propagation.REQUIRES_NEW：将原来的事务挂起，开启一个新的事务
	 * 	2.★isolation：用来设置事务的隔离级别
	 * 		-Isolation.REPEATABLE_READ：可重复读，MySQL默认的隔离级别
	 * 		-Isolation.READ_COMMITTED：读已提交，Oracle默认的隔离级别，开发时通常使用的隔离级别
	 */
    传播行为有七种 REQUIRED REQUIRED_NEW SUPPORT NOT_SUPPORT MANDATORY NEVER NESTED
    隔离级别有四种 1)READ UNCOMMITTED
                  2)READ COMMITTED  Oracle默认隔离级别
                  3)REPEATABLE READ Mysql默认隔离级别
                  4)SERIALIZABLE
```

8.3 测试数据准备

8.3.2 数据库表
```sql
CREATE TABLE book (
  isbn VARCHAR (50) PRIMARY KEY,
  book_name VARCHAR (100),
  price INT
) ;

CREATE TABLE book_stock (
  isbn VARCHAR (50) PRIMARY KEY,
  stock INT
  ) ;

CREATE TABLE account (
  username VARCHAR (50) PRIMARY KEY,
  balance INT
) ;
```

```sql
INSERT INTO account (`username`,`balance`) VALUES ('Tom',100000);
INSERT INTO account (`username`,`balance`) VALUES ('Jerry',150000);
```

```sql
INSERT INTO book (`isbn`,`book_name`,`price`) VALUES ('ISBN-001','book01',100);
INSERT INTO book (`isbn`,`book_name`,`price`) VALUES ('ISBN-002','book02',200);
INSERT INTO book (`isbn`,`book_name`,`price`) VALUES ('ISBN-003','book03',300);
INSERT INTO book (`isbn`,`book_name`,`price`) VALUES ('ISBN-004','book04',400);
INSERT INTO book (`isbn`,`book_name`,`price`) VALUES ('ISBN-005','book05',500);
```

```sql
INSERT INTO book_stock (`isbn`,`stock`) VALUES ('ISBN-001',1000);
INSERT INTO book_stock (`isbn`,`stock`) VALUES ('ISBN-002',2000);
INSERT INTO book_stock (`isbn`,`stock`) VALUES ('ISBN-003',3000);
INSERT INTO book_stock (`isbn`,`stock`) VALUES ('ISBN-004',4000);
INSERT INTO book_stock (`isbn`,`stock`) VALUES ('ISBN-005',5000);
```

