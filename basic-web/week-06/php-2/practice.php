<?php
$menu = [
    [
        "name" => "Beranda"
    ],
    [
        "name" => "Wisata",
        "subMenu" => [
            [
                "name" => "wisata",
                "subMenu" => [
                    [
                        "name" => "Pantai"
                    ],
                    [
                        "name" => "Gunung"
                    ]
                ]
            ],
            [
                "name" => "Kuliner"
            ],
            [
                "name" => "Hiburan"
            ]
        ]
    ],
    [
        "name" => "Tentang"
    ],
    [
        "name" => "Kontak"
    ]  
];

function showMenu(array $menu, $indentation = 0) {
    echo "<ul>";
    foreach ($menu as $key => $item) {
        echo "<li>" . $item["name"] . "</li>";
        if (isset($item["subMenu"])) {
            showMenu($item["subMenu"], $indentation + 1);
        }
    }
    echo "</ul>";
}

showMenu($menu);
?>
