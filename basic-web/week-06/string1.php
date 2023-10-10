<?php
$loremipsum ="Lorem ipsum dolor sit amet consectetur, adipisicing elit. Mollitia quod vitae dolorem? Illum inventore tenetur, repellendus obcaecati sed esse placeat omnis ipsa delectus quam blanditiis rem cupiditate quibusdam animi. Quisquam!";

echo "<p>$loremipsum</p>";
echo "String length: ".strlen($loremipsum)."<br/>";
echo "String word count: ".str_word_count($loremipsum)."<br/>";
echo "<p>" . strtoupper($loremipsum) . "</p>";
echo "<p>" . strtolower($loremipsum) . "</p>";
?>