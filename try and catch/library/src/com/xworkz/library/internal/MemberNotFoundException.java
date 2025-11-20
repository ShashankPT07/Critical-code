package com.xworkz.library.internal;

public class MemberNotFoundException extends Exception {
    public String checkMember(int memberId) {
        if (memberId < 100) {
            return "Member not found";
        } else {
            return "Member found";
        }
    }
}
