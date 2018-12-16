package com.huzeyfekiran.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private List<Crime> crimes;

    public static CrimeLab get(Context context){
        if(sCrimeLab == null){
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context) {
        crimes = new ArrayList<>();
    }

    public List<Crime> getCrimes() {
        return crimes;
    }

    public void addCrime(Crime crime){
        crimes.add(crime);
    }

    public void deleteCrime(Crime crime){
        crimes.remove(crime);
    }

    public Crime getCrime(UUID id){
        for(Crime crime: crimes){
            if(crime.getId().equals(id)){
                return crime;
            }
        }
        return null;
    }

    public int getIndex(UUID id){
        for (int i = 0; i < crimes.size(); i++){
            if(crimes.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

}
