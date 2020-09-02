<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Zero to Mastery -Our HTML Project</title>
    <link rel="icon" href="resources\images\logo.png" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.7.2/animate.min.css" />
    <link rel="stylesheet" href="resources/style/particles.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
        integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css?family=Lora|Montserrat&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Lora|Montserrat&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.min.css">
    <link rel="stylesheet" href="resources/style/style.css" />
    <!-- Font Awsome CSS -->
    <link rel="stylesheet" type="text/css"
        href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
        integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>

<body>
    <!-- navbar -->
    <nav class="navbar navbar-expand-lg fixed-top">
        <a class="navbar-brand" href="index.html"><img src="resources/images/logo.png" alt=""></a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item">
                    <a class="nav-link" href="index.html">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="about.html">About</a>
                </li>
                <li class="nav-item register-link">
                    <a class="nav-link" href="instructor.html">Instructor</a>
                </li>
                <li class="nav-item register-link">
                    <a class="nav-link" href="register.html">Sign Up</a>
                </li>
                <li class="nav-item register-link">
                    <a class="nav-link" href="contributersProfile.html">Contributors</a>
                </li>
            </ul>
        </div>
        <a class="nav-link ml-md-auto" href="beyondztm.html">Beyond Zero to Mastery</a>
    </nav>

    <div class="animated bounce">
        <div class="header-container parallax">
            <div class="header-container-bg-fade">
                <div id="particles-js"></div>
                <div class="header-content d-flex flex-column align-items-center">
                    <h1>
                        <div id="carouselExampleSlidesOnly" class="carousel slide" data-ride="carousel">
                            <div class="carousel-inner">
                                <div class="carousel-item active">
                                    <div draggable="true"><a
                                            href="https://www.udemy.com/course/the-complete-web-developer-zero-to-mastery/"
                                            target="_blank">Web Development <br></div>
                                </div>
                                <div class="carousel-item">
                                    <div draggable="true"><a
                                            href="https://www.udemy.com/course/complete-python-developer-zero-to-mastery/"
                                            target="_blank">Python <br></div>
                                </div>
                                <div class="carousel-item">
                                    <div draggable="true"><a
                                            href="https://www.udemy.com/course/complete-machine-learning-and-data-science-zero-to-mastery/"
                                            target="_blank">Machine Learning <br></div>
                                </div>
                            </div>
                        </div>
                        <hr>
                        <a>Zero To<span class="masteryColor"> Mastery</span></a>
                    </h1>

                    <a href="instructor.html" id="course-button" class="btn btn-primary">View Courses</a>

                </div>
            </div>

            <div class="container details-container">
                <div class="container">
                    <h2 class="animated bounce text-center">Why this Course?</h2>

                    <div class="row">
                        <div class="col-lg d-flex align-items-center justify-content-center justify-content-lg-end">
                            <img src="resources/images/browser.png" id="course-img" alt="Course image">
                        </div>
                        <div class="col-lg d-flex align-items-center justify-content-center justify-content-lg-start">
                            <h4 class="m-3 text-center text-lg-left">Do you imagine yourself working as a web developer
                                but don't
                                know where to start?</h4>
                        </div>
                    </div>

                    <hr class="rounded">


                    <div class="row">
                        <div class="col-lg d-flex align-items-center justify-content-center justify-content-lg-start">
                            <img src="resources/images/social-media.jpg" id="course-img" alt="Course image">
                        </div>
                        <div class="col-lg d-flex align-items-center justify-content-center justify-content-lg-start">
                            <h4 class="m-3 text-center text-lg-left">Do you want to learn the basics that can get you up
                                and running
                                quickly?</h4>
                        </div>
                    </div>

                    <hr class="rounded">


                    <div class="row">
                        <div class="col-lg d-flex align-items-center justify-content-center">
                            <img src="resources/images/wallet.png" id="course-img" alt="Course image">
                        </div>
                        <div class="col-lg d-flex align-items-center justify-content-center justify-content-lg-start">
                            <h4 class="m-3 text-center text-lg-left">Do you want to make money in 2020?</h4>
                        </div>
                    </div>

                    <hr class="rounded">

                </div>
            </div>

            <div class="container-fluid software-details">
                <h4>In this course you will learn the basics of the following technologies:</h4><br>
                <div class="row justify-content-center">
                    <a href="https://www.w3schools.com/html/html5_intro.asp" target="_blank">
                        <div class="col-md-3 col-sm-12">
                            <div class="card text-center">
                                <div class="card-body">
                                    <h5 class="card-title">HTML 5</h5>
                                    <p class="card-text">
                                        <img src="resources/images/html5-new.png" alt="HTML 5">
                                    </p>
                                </div>
                            </div>
                        </div>
                    </a>
                    <a href="https://www.w3schools.com/css/" target="_blank">
                        <div class="col-md-3 col-sm-12">
                            <div class="card text-center">
                                <div class="card-body">
                                    <h5 class="card-title">CSS 3</h5>
                                    <p class="card-text">
                                        <img src="https://juststickers.in/wp-content/uploads/2014/05/CSS3-Mark-Shape-Cut.png"
                                            alt="CSS 3">
                                    </p>
                                </div>
                            </div>
                        </div>
                    </a>
                    <a href="https://www.w3schools.com/bootstrap4/" target="_blank">
                        <div class="col-md-3 col-sm-12">
                            <div class="card text-center">
                                <div class="card-body">
                                    <h5 class="card-title">Bootstrap 4</h5>
                                    <p class="card-text">
                                        <img src="https://miro.medium.com/max/1024/1*9HanDsRU11ZMsgDGJwN96w.png"
                                            alt="Bootstrap 4">
                                    </p>
                                </div>
                            </div>
                        </div>
                    </a>
                    <a href="https://www.w3schools.com/js/" target="_blank">
                        <div class="col-md-3 col-sm-12">
                            <div class="card text-center">
                                <div class="card-body">
                                    <h5 class="card-title">Javascript</h5>
                                    <p class="card-text">
                                        <img src="https://www.easyprogramming.net/logo/js.png" alt="Pure JavaScript/">
                                    </p>
                                </div>
                            </div>
                        </div>
                    </a>
                    <a href="https://reactjs.org/" target="_blank">
                        <div class="col-md-3 col-sm-12">
                            <div class="card text-center">
                                <div class="card-body">
                                    <h5 class="card-title">React</h5>
                                    <p class="card-text">
                                        <img src="https://raw.githubusercontent.com/rexxars/react-hexagon/HEAD/logo/react-hexagon.png"
                                            alt="react">
                                    </p>
                                </div>
                            </div>
                        </div>
                    </a>
                    <a href="https://github.com/zero-to-mastery/start-here-guidelines" target="_blank">
                        <div class="col-md-3 col-sm-12">
                            <div class="card text-center">
                                <div class="card-body">
                                    <h5 class="card-title">Git + Github</h5>
                                    <p class="card-text">
                                        <img src="resources/images/git.svg" alt="Git + Github">
                                    </p>
                                </div>
                            </div>
                        </div>
                    </a>
                    <a href="https://www.w3schools.com/nodejs/nodejs_intro.asp" target="_blank">
                        <div class="col-md-3 col-sm-12">
                            <div class="card text-center">
                                <div class="card-body">
                                    <h5 class="card-title">Node JS</h5>
                                    <p class="card-text">
                                        <img src="./resources/images/node.ico" alt="Node.js">
                                    </p>
                                </div>
                            </div>
                        </div>
                    </a>
                    <a href="https://www.tutorialspoint.com/expressjs/" target="_blank">
                        <div class="col-md-3 col-sm-12">
                            <div class="card text-center">
                                <div class="card-body">
                                    <h5 class="card-title">Express JS</h5>
                                    <p class="card-text">
                                        <img src="resources/images/express.png" alt="Express js">
                                    </p>
                                </div>
                            </div>
                        </div>
                    </a>
                    <a href="https://www.w3schools.com/nodejs/nodejs_npm.asp" target="_blank">
                        <div class="col-md-3 col-sm-12">
                            <div class="card text-center">
                                <div class="card-body">
                                    <h5 class="card-title">NPM</h5>
                                    <p class="card-text">
                                        <img src="https://avatars2.githubusercontent.com/u/6078720?s=400&amp;v=4"
                                            alt="NPM">
                                    </p>
                                </div>
                            </div>
                        </div>
                    </a>
                    <a href="https://www.tutorialspoint.com/postgresql/" target="_blank">
                        <div class="col-md-3 col-sm-12">
                            <div class="card text-center">
                                <div class="card-body">
                                    <h5 class="card-title">PostgresSQL</h5>
                                    <p class="card-text">
                                        <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/2/29/Postgresql_elephant.svg/1000px-Postgresql_elephant.svg.png"
                                            alt="PostgresSQL">
                                    </p>
                                </div>
                            </div>
                        </div>
                    </a>
                    <a href="https://www.w3schools.com/sql/" target="_blank">
                        <div class="col-md-3 col-sm-12">
                            <div class="card text-center">
                                <div class="card-body">
                                    <h5 class="card-title">SQL</h5>
                                    <p class="card-text">
                                        <img src="https://crmtipoftheday.com/wp-content/uploads/2017/10/Database-250x250.png"
                                            alt="SQL">
                                    </p>
                                </div>
                            </div>
                        </div>
                    </a>
                    <a href="https://graphql.org/" target="_blank">
                        <div class="col-md-3 col-sm-12">
                            <div class="card text-center">
                                <div class="card-body">
                                    <h5 class="card-title">GraphQL</h5>
                                    <p class="card-text">
                                        <img src="https://upload.wikimedia.org/wikipedia/commons/1/17/GraphQL_Logo.svg"
                                            alt="GraphQL">
                                    </p>
                                </div>
                            </div>
                        </div>
                    </a>
                    <h4> The course is constantly being updated with the most recent technologies, frameworks,
                        resources, and everything you need to become an amazing developer in an evolving world!</h4>
                </div>
            </div>

            <div class="waveDividerWrapper">
                <div class="custom-shape-divider-bottom-1596474166">
                    <svg data-name="Layer 1" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 1200 120"
                        preserveAspectRatio="none">
                        <path
                            d="M0,0V46.29c47.79,22.2,103.59,32.17,158,28,70.36-5.37,136.33-33.31,206.8-37.5C438.64,32.43,512.34,53.67,583,72.05c69.27,18,138.3,24.88,209.4,13.08,36.15-6,69.85-17.84,104.45-29.34C989.49,25,1113-14.29,1200,52.47V0Z"
                            opacity=".25" class="shape-fill"></path>
                        <path
                            d="M0,0V15.81C13,36.92,27.64,56.86,47.69,72.05,99.41,111.27,165,111,224.58,91.58c31.15-10.15,60.09-26.07,89.67-39.8,40.92-19,84.73-46,130.83-49.67,36.26-2.85,70.9,9.42,98.6,31.56,31.77,25.39,62.32,62,103.63,73,40.44,10.79,81.35-6.69,119.13-24.28s75.16-39,116.92-43.05c59.73-5.85,113.28,22.88,168.9,38.84,30.2,8.66,59,6.17,87.09-7.5,22.43-10.89,48-26.93,60.65-49.24V0Z"
                            opacity=".5" class="shape-fill"></path>
                        <path
                            d="M0,0V5.63C149.93,59,314.09,71.32,475.83,42.57c43-7.64,84.23-20.12,127.61-26.46,59-8.63,112.48,12.24,165.56,35.4C827.93,77.22,886,95.24,951.2,90c86.53-7,172.46-45.71,248.8-84.81V0Z"
                            class="shape-fill"></path>
                    </svg>
                </div>
            </div>


            <div class="container-fluid footer-container">
                <div class="a2a_kit a2a_kit_size_32 a2a_default_style" style="line-height: 32px">
                    <h5>If you enjoyed the course like I did, share it so more people can enjoy it!</h5>
                    <div class="buttons">
                        <a class="a2a_button_facebook"><i class="fab fa-facebook fa-2x"></i></a>
                        <a class="a2a_button_twitter"><i class="fab fa-twitter fa-2x"></i></a>
                        <a class="a2a_button_email"><i class="fas fa-envelope-square fa-2x"></i></a>
                        <a class="a2a_button_whatsapp"><i class="fab fa-whatsapp fa-2x"></i></a
                    </div>
                </div>

                <div id="credits">
                    Made by CWD &copy; All rights reserved by ZTM
                </div>
            </div>
        </div>

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
            integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous">
        </script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
            integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous">
        </script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
            integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous">
        </script>
        <script src="resources/scripts/particles.js"></script>
        <script src="resources/scripts/app.js"></script>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
            integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous">
        </script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
            integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous">
        </script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
            integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous">
        </script>
        <script src="https://code.jquery.com/jquery-3.4.1.min.js"
            integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/typed.js@2.0.9"></script>
        <script type="text/javascript" src="resources/scripts/script.js"></script>
        <script async src="https://static.addtoany.com/menu/page.js"></script>
</body>

</html>
