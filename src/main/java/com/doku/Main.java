package com.doku;

import com.doku.dto.Kelas;
import com.doku.dto.MataKuliah;

import static com.doku.utils.IsActive.isActive;

/**
 * @author robihidayat
 */
public class Main {
    public static void main(String[] args) {

        Kelas kelas = new Kelas();
        kelas.setClassName("Kelas A");
        kelas.setStudentName("robi hidayat");
        MataKuliah mataKuliah = new MataKuliah();
        mataKuliah.setCodeKuliah("001");
        mataKuliah.setMataKuliahName("Penjas");

        System.out.println(kelas.getClassName());
        System.out.println(kelas.getStudentName());
        System.out.println(mataKuliah.getCodeKuliah());
        System.out.println(mataKuliah.getMataKuliahName());
        System.out.println(isActive(kelas));

    }

}
