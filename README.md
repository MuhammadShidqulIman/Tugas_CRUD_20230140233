
## 🌐 Tampilan Web Interface
<img width="2879" height="1621" alt="image" src="https://github.com/user-attachments/assets/cfea1834-df01-40c1-86df-a09f58fb47a4" />


### 1️⃣ Create

**Method:** `POST`  
**Endpoint:** `/ktp`

**Request Body:**
```json
{
  "nomorKtp": "233",
  "namaLengkap": "Muhammad Shidqul",
  "alamat": "Dompu",
  "tanggalLahir": "2002-03-03",
  "jenisKelamin": "Laki-Laki"
}

```
Response Body (success):
```json
{
    "alamat": "Dompu",
    "id": 2,
    "jenisKelamin": "Laki-Laki",
    "namaLengkap": "Muhammad Shidqul",
    "nomorKtp": "233",
    "tanggalLahir": "2002-03-03T00:00:00.000Z"
}

```
### 2️⃣ Update 

**Method:** `PUT`  
**Endpoint:** `/ktp/{id}`

**Request Body:**
```json
{
  "nomorKtp": "233",
  "namaLengkap": "Muhammad Shidqul",
  "alamat": "NTB (UPDATE)",
  "tanggalLahir": "2002-03-03",
  "jenisKelamin": "Laki-Laki"
}
```
Response Body (success):
```json
{
    "alamat": "NTB (UPDATE)",
    "id": 2,
    "jenisKelamin": "Laki-Laki",
    "namaLengkap": "Muhammad Shidqul",
    "nomorKtp": "233",
    "tanggalLahir": "2002-03-03T00:00:00.000Z"
}
```

### 3️⃣ Get

**Method:** `GET`

**Endpoint:** `/ktp`

**Response Body (success):**
```json
[
    {
        "alamat": "NTB",
        "id": 1,
        "jenisKelamin": "Laki-Laki",
        "namaLengkap": "Muhammad Shidqul Iman",
        "nomorKtp": "20230140233",
        "tanggalLahir": "2026-03-03T16:00:00.000Z"
    },
    {
        "alamat": "NTB (UPDATE)",
        "id": 2,
        "jenisKelamin": "Laki-Laki",
        "namaLengkap": "Muhammad Shidqul",
        "nomorKtp": "233",
        "tanggalLahir": "2002-03-02T16:00:00.000Z"
    }
]
```
### 4️⃣ Delete

**Method:** `DELETE`

**Endpoint:** `/ktp/{id}`

**Response Body (success):**
```json
Data berhasil dihapus
```
DATABASE
<img width="2877" height="1703" alt="image" src="https://github.com/user-attachments/assets/3c58db70-a053-497b-8ffa-dfa9f62271ee" />




