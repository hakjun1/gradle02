package com.dbexercise.domain;

public class UserDaoFactory {
    //조립을 해준다
    public UserDaoAbstract awsUserDao() {//날개 5개 선풍기
        AwsConnectionMaker2 awsConnectionMaker2 = new AwsConnectionMaker2();
        UserDaoAbstract userDaoAbstract = new UserDaoAbstract(awsConnectionMaker2);
        return userDaoAbstract;
    }
    public UserDaoAbstract localUserDao() {//날개 4개 선풍기
        UserDaoAbstract userDaoAbstract = new UserDaoAbstract((new LocalConnectionMaker2()));
        //위두줄을 간략화
        return userDaoAbstract;
    }
}
