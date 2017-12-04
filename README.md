# E-Payment-Systems-DC
E-Payment Systems project for insurance company functionalities

Koriste se dve baze i bilo bi najjednostavnije ako bi svi uzeli Oracle i napravili i iste user-e i citave konekcije.
Ispod se nalazi kreiranje korisnika.

```
CREATE USER policiesAndPaymants IDENTIFIED BY policiesAndPaymants
                                DEFAULT TABLESPACE USERS TEMPORARY TABLESPACE TEMP;
                GRANT CONNECT, RESOURCE TO policiesAndPaymants;
                GRANT CREATE TABLE TO policiesAndPaymants;
                GRANT CREATE VIEW TO policiesAndPaymants;
                GRANT CREATE PROCEDURE TO policiesAndPaymants;
                GRANT CREATE SYNONYM TO policiesAndPaymants;
                GRANT CREATE SEQUENCE TO policiesAndPaymants;
                GRANT SELECT ON dba_rollback_segs TO policiesAndPaymants;
                GRANT SELECT ON dba_segments TO policiesAndPaymants;

CREATE USER insurance IDENTIFIED BY insurance
                                DEFAULT TABLESPACE USERS TEMPORARY TABLESPACE TEMP;
                GRANT CONNECT, RESOURCE TO insurance;
                GRANT CREATE TABLE TO insurance;
                GRANT CREATE VIEW TO insurance;
                GRANT CREATE PROCEDURE TO insurance;
                GRANT CREATE SYNONYM TO insurance;
                GRANT CREATE SEQUENCE TO insurance;
                GRANT SELECT ON dba_rollback_segs TO insurance;
                GRANT SELECT ON dba_segments TO insurance;

```

I jos na kraju mora da se isprati uputstuvo u odgovoru na sledecem linku za problem sa OJDBC-om https://stackoverflow.com/questions/1074869/find-oracle-jdbc-driver-in-maven-repository
