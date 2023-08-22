-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 18 Agu 2023 pada 14.15
-- Versi server: 10.4.20-MariaDB
-- Versi PHP: 7.4.22

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_tokoberas`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE `admin` (
  `id` varchar(30) NOT NULL,
  `namaadmin` varchar(20) NOT NULL,
  `jabatan` varchar(20) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`id`, `namaadmin`, `jabatan`, `password`) VALUES
('ADM001', 'admin', 'admin', 'admin');

-- --------------------------------------------------------

--
-- Struktur dari tabel `barang`
--

CREATE TABLE `barang` (
  `idbarang` varchar(20) NOT NULL,
  `jenisbarang` varchar(30) NOT NULL,
  `namabarang` varchar(30) NOT NULL,
  `harga` varchar(30) NOT NULL,
  `stok` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `barang`
--

INSERT INTO `barang` (`idbarang`, `jenisbarang`, `namabarang`, `harga`, `stok`) VALUES
('BRG001', 'BIASA', 'Raja Lele', '150000', '40');

-- --------------------------------------------------------

--
-- Struktur dari tabel `kategori`
--

CREATE TABLE `kategori` (
  `supplier` varchar(30) NOT NULL,
  `idkategori` varchar(30) NOT NULL,
  `namakategori` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `kategori`
--

INSERT INTO `kategori` (`supplier`, `idkategori`, `namakategori`) VALUES
('SPR-0001', 'PRE001', 'PULEN'),
('SPR-0001', 'MED001', 'BIASA');

-- --------------------------------------------------------

--
-- Struktur dari tabel `supplier`
--

CREATE TABLE `supplier` (
  `idsp` varchar(20) NOT NULL,
  `namasp` varchar(30) NOT NULL,
  `notelp` varchar(20) NOT NULL,
  `alamat` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `supplier`
--

INSERT INTO `supplier` (`idsp`, `namasp`, `notelp`, `alamat`) VALUES
('SPR-0001', 'PT. Sejahtera', '081256741243', 'Jakarta'),
('SPR-0002', 'PT. Bangun Jaya', '0819543671', 'Bogor'),
('SPR-0003', 'PT. Jaya Abadi', '08176534211', 'Bekasi');

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksikeluar`
--

CREATE TABLE `transaksikeluar` (
  `idpesanan` varchar(30) NOT NULL,
  `idtransaksi` varchar(30) NOT NULL,
  `namapetugas` varchar(30) NOT NULL,
  `namapelanggan` varchar(30) NOT NULL,
  `notelp` varchar(20) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `tanggal` date NOT NULL,
  `kdbarang` varchar(30) NOT NULL,
  `jumlah` varchar(20) NOT NULL,
  `total` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `transaksikeluar`
--

INSERT INTO `transaksikeluar` (`idpesanan`, `idtransaksi`, `namapetugas`, `namapelanggan`, `notelp`, `alamat`, `tanggal`, `kdbarang`, `jumlah`, `total`) VALUES
('TRA-0031', 'TRB-0020', 'setUserLogin : admin', 'Heri', '0817654390', 'Bekasi', '2023-08-19', 'BRG001', '10', '1500000');

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksimasuk`
--

CREATE TABLE `transaksimasuk` (
  `idtransaksi` varchar(30) NOT NULL,
  `idbarang` varchar(30) NOT NULL,
  `namapetugas` varchar(30) NOT NULL,
  `namasp` varchar(30) NOT NULL,
  `tanggal` date NOT NULL,
  `jumlah` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `transaksimasuk`
--

INSERT INTO `transaksimasuk` (`idtransaksi`, `idbarang`, `namapetugas`, `namasp`, `tanggal`, `jumlah`) VALUES
('TRB-0001', 'BRG001', 'setUserLogin : admin', 'PT. Bangun Jaya', '2023-08-18', '30');

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksireturn`
--

CREATE TABLE `transaksireturn` (
  `idpengembalian` varchar(30) NOT NULL,
  `idrefrensi` varchar(30) NOT NULL,
  `namapetugas` varchar(30) NOT NULL,
  `namapelanggan` varchar(30) NOT NULL,
  `notelp` varchar(20) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `keterangan` varchar(100) NOT NULL,
  `tanggal` date NOT NULL,
  `kdbarang` varchar(30) NOT NULL,
  `namabarang` varchar(30) NOT NULL,
  `jumlah` varchar(20) NOT NULL,
  `total` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`idbarang`);

--
-- Indeks untuk tabel `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`idsp`);

--
-- Indeks untuk tabel `transaksikeluar`
--
ALTER TABLE `transaksikeluar`
  ADD PRIMARY KEY (`idpesanan`);

--
-- Indeks untuk tabel `transaksimasuk`
--
ALTER TABLE `transaksimasuk`
  ADD PRIMARY KEY (`idtransaksi`);

--
-- Indeks untuk tabel `transaksireturn`
--
ALTER TABLE `transaksireturn`
  ADD PRIMARY KEY (`idpengembalian`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
