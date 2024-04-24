package com.example.androidtest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainActivityLocalTest {
    @Test
    public void testSapaanDenganNama() {
        // Pengujian untuk memeriksa apakah pesan sapaan ditampilkan dengan benar saat nama diberikan
        String name = "Jane Doe";
        String pesanYangDiHarapkan = "Halo, " + name + "!";
        String pesanYangAktual = MainActivity.generateGreetMessage(name);
        assertEquals(pesanYangDiHarapkan, pesanYangAktual);
    }

    @Test
    public void testSapaanTanpaNama() {
        // Pengujian untuk memeriksa apakah pesan sapaan default ditampilkan dengan benar saat nama kosong
        String name = "";
        String pesanYangDiHarapkan = "Halo, !";
        String pesanYangAktual = MainActivity.generateGreetMessage(name);
        assertEquals(pesanYangDiHarapkan, pesanYangAktual);
    }
}
