class BankRunner{
    public static void main(String[] args){

        int[] accountNumber={101,102,103,104};
        int[] numbers=Bank.accountNumber(accountNumber);
        for(int value=0;value<numbers.length;value++){
            System.out.println(numbers[value]);
        }

        long[] accountBalance={500000l,750000l,1200000l};
        long[] balances=Bank.accountBalance(accountBalance);
        for(int value=0;value<balances.length;value++){
            System.out.println(balances[value]);
        }

        double[] interestRate={3.5,4.2,3.8};
        double[] rates=Bank.interestRate(interestRate);
        for(int value=0;value<rates.length;value++){
            System.out.println(rates[value]);
        }

        float[] loanAmount={250000.5f,500000.75f,750000.25f};
        float[] loans=Bank.loanAmount(loanAmount);
        for(int value=0;value<loans.length;value++){
            System.out.println(loans[value]);
        }

        char[] accountType={'S','C','F'};
        char[] types=Bank.accountType(accountType);
        for(int value=0;value<types.length;value++){
            System.out.println(types[value]);
        }

        boolean[] isActive={true,false,true};
        boolean[] active=Bank.isActiveAccount(isActive);
        for(int value=0;value<active.length;value++){
            System.out.println(active[value]);
        }

        String[] bankName={"HDFC","SBI","Canara"};
        String[] name=Bank.bankName(bankName);
        for(int value=0;value<name.length;value++){
            System.out.println(name[value]);
        }
    }
}
