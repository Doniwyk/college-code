<?php
$studentScore = [85, 92, 78, 64, 90, 55, 88, 79, 70, 96];
$passedScore = [];

foreach ($studentScore as $score) {
    if ($score >= 70) {
        $passedScore[] = $score;
    }
}

echo "Daftar nilai siswa yang lulus: " . implode(', ', $passedScore), "<br>";

$employeeList = [
    ['Alice', 7],
    ['Bob', 3],
    ['Charlie', 9],
    ['David', 5],
    ['Eva', 6]
];

$employeeFiveYearExperience = [];

foreach ($employeeList as $employee) {
    if ($employee) {
        $employeeFiveYearExperience[] = $employee[0];
    }
}

echo "Daftar karyawan dengan pengalaman kerja lebih dari 5 tahun: " . implode(', ', $employeeFiveYearExperience), "<br>";

$scoreList = [
    'Matematika' => [
        ['Alice', 85],
        ['Bob', 92],
        ['Charlie', 78],
    ],
    'Fisika' => [
        ['Alice', 90],
        ['Bob', 88],
        ['Charlie', 75],
    ],
    'Kimia' => [
        ['Alice', 92],
        ['Bob', 80],
        ['Charlie', 85],
    ]
    ];

$subject = 'Fisika';
echo "Daftar nilai mahasiswa dalam mata kuliah $subject: <br>";

foreach ($scoreList[$subject] as $score) {
    echo "Nama: {$score[0]}, Nilai: {$score[1]} <br>";
}
?>