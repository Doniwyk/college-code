#import "@preview/basic-resume:0.1.0": *

// Put your personal information here, replacing mine
#let name = "Doni Wahyu Kurniawan"
#let location = "Malang, Indonesia"
#let email = "doniwyk@gmail.com"
#let github = "github.com/doniwyk"
#let linkedin = "linkedin.com/in/doniwyk"
#let phone = "+62 896 5904 0838"
// #let personal-site = "doniwyk.vercel.app"

#show: resume.with(
  author: name,
  location: location,
  email: email,
  github: github,
  linkedin: linkedin,
  phone: phone,
  // personal-site: personal-site,
  // Accent color is optional. Feel free to remove the next line if you want your resume to be in black and white
  // accent-color: "#26428b",
)

== Summary
An undergraduate student at the State Polytechnic of Malang, majoring in Informatics Engineering with a focus on front-end engineering. Passionate about creating user-friendly, responsive web interfaces and keen to contribute to innovative web development projects.

== Education

#edu(
  institution: "State Polytechnic of Malang",
  location: "Malang, Indonesia",
  dates: dates-helper(start-date: "Aug 2022", end-date: "May 2026"),
  degree: "Bachelor's of Applied Science, Informatics Engineering",
)
- Cumulative GPA: 3.94\/4.0
- Community Vice Leader of Workshop Riset Informatika 2023/2024
- Outstanding Student of Informatics Engineering 2023/2024

#edu(
  institution: "SMA Negeri 1 Batu",
  location: "Batu, Indonesia",
  dates: dates-helper(start-date: "Jul 2019", end-date: "May 2022"),
  degree: "High School Diploma",
)
- Member of Math Olympiad Extracurricular

== Projects

#project(
  role: "Front End Developer",
  name: "Faculty Inventory Management",
  url: "github.com/zalaaaaa/PBL-Inventory",
)
- Developed an efficient solution for managing item borrowing in the faculty
- Developed using PHP, CSS, JavaScript, and MySQL
- Implemented a user-friendly interface for both students and faculty staff
- Implemented real-time tracking of borrowed and available items for inventory management
#project(
  role: "Front End Developer",
  name: "Neighbourhood (RW) Information System Management",
  url: "github.com/Doniwyk/siruwa",
)
- Automated RW administrative processes, including population data recording, contribution payments, and document requests
- Developed using Laravel, Tailwind CSS, and MySQL
- Implemented a user-friendly interface for both RW administrators and residents
- Designed and developed an intuitive and responsive user interface optimized for both desktop and mobile, ensuring seamless access across various devices

== Extracurricular Activities

#extracurriculars(
  activity: "Workshop Riset Informatika",
  dates: dates-helper(start-date: "Oct 2022", end-date: "Present"),
)
- Community Vice Leader of Workshop Riset Informatika 2023/2024 period
- Helped to teach and mentor students in basic web development
- Helped to organize and manage the events for the community

== Skills
- *Programming Languages*: JavaScript, Python, PHP, SQL
- *Technologies*: Laravel, Tailwind CSS, Git

== Languages
- *Indonesian*: Native
- *English*: Intermediate