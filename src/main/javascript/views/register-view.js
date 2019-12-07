function start() {
    clear();
    $("#contacts-body-112").hide();
    $("#main-section").hide();
    renderForm();
}

function clear() {
    $('#article-body').empty();
    $('#video-body').empty();
    $('#register-body').empty();
    $('#contacts-body').empty();
    $('#quiz-body').empty();
}

const api = {
    dataType: 'json',
    base: 'http://192.168.2.33:8080/womanizer/api',
};

function renderForm() {
    /* eslint-disable no-param-reassign */



    let html = ` 
           <div class="grid-container">
               <div class="grid-x grid-padding-x grid-margin-x">
                   <div class="cell medium-6">
                       <h2>REGISTER</h2>
                       <form action="${api.base}/therapist" id="edit-form">
                            <label for="name"> Name
                                <input type="text" name="name" id="name">
                            </label>
                            <label for="email"> Email
                                <input type="email" name="email" id="email">
                            </label>               
                            <label for="phone"> Phone
                                <input type="number" name="phone" id="phone">
                            </label>
                            <label for="password"> Password
                                <input type="password" name="password" id="password">
                            </label>                
                            <label for="location"> Location
                                <select name="location">
                                    <option value="porto">Porto</option>
                                    <option value="fundao">Fundão</option>
                                    <option value="coimbra">Coimbra</option>
                                    <option value="lisboa">Lisboa</option>
                                </select>
                            </label>
                            <label for="license"> License
                                <input type="text" name="licenseNumber" id="licenseNumber">
                            </label>
                            <button type="submit" class="read-more" style="cursor:pointer" onclick="goHome()">REGISTER</button>
                            <!--a href="#" class="read-more">REGISTER</a-->         
                        </form>
                   </div>
                   <div class="cell large-6">
                        <h2>LOGIN</h2>
                        <form action="">
                             <label for="email"> Email
                                 <input type="email" name="email">
                             </label>
                             <label for="password"> Password
                                 <input type="password" name="password">
                             </label>
                             <button type="submit" class="read-more" style="cursor:pointer" onclick="goHome()">LOGIN </button>
                         </form> 
                   </div> 
                </div>
           </div>
           <script>
           function goHome() {
               //window.location.hash = 'home';
           }
           </script>
     `

    $("#register-body").append(html);

}

export default {
    start,
    clear
};
