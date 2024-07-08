<template>
  <div class="login-container">
    <el-card class="login-card">
      <h3 class="login-title" id="lofont">用户登录/注册</h3>
      <el-form :model="form" label-width="40px" class="login-form">


        <div class="lofont1">
          <el-form-item label="账号">
            <el-input v-model="form.username"></el-input>
          </el-form-item>
          <el-form-item label="密码">
            <el-input v-model="form.password"></el-input>
          </el-form-item>
        </div>

		<el-form-item label="姓名" v-if="regist">
		  <el-input v-model="form.user"></el-input>
		</el-form-item>
		<el-form-item label="性别" v-if="regist">
		  <el-select v-model="form.sex" placeholder="请选择">
			<el-option
			  v-for="item in [{label:'男',value:'男'},{label:'女',value:'女'}]"
			  :key="item.value"
			  :label="item.label"
			  :value="item.value">
			</el-option>
		  </el-select>
		</el-form-item>
		<el-form-item label="年龄" v-if="regist">
		  <el-input-number v-model="form.age"></el-input-number>
		</el-form-item>
        <el-form-item style="text-align: right; margin-top: 35px;">
          <el-button type="danger" @click="register()">注册</el-button>
          <el-button type="primary" @click="login">登录</el-button>
        </el-form-item>
      </el-form>
    </el-card>
  </div>
</template>

<script>
export default {
  data(){return{
    form: {
	  username:'',
	  password:'',
	  sex: '男',
	  age: 18,
	  user: '',
	},
	regist: false,
  }},
  methods: {
    login(){
      this.$http.get('/user/ellogin', {params: this.form}).then(({data})=>{
        if (data.code == 1) {
	        localStorage.setItem('uid', data.uid);
	        localStorage.setItem('user', data.user);
	        localStorage.setItem('status', data.status);
	        this.$router.push('/myorder/my');
        } else {
	        alert('用户名或密码错误');
        }
      });
    },
	register() {
	if (!this.regist) {
		this.regist = true;
	} else {
		this.$http.post('/user/elregister', this.form).then(({data})=>{
			if (data.code == 0) {
				alert(data.msg);
			} else {
				alert('注册成功请登录');
				this.regist = false;
			}
		});
	}},
  }
}
</script>

<style scoped>
.login-container {
  background-image: url('../../public/bg.png');
  background-size: cover;
  background-position: right;
  display: flex;
  height: 100vh;

  justify-content: right;
}
.login-card {
  width: 400px;
}
.login-form {
  margin-top: 40px;
}
.login-title {
  margin-top: 70px;
  font-size: 24px;
  text-align: center;
  font-family: 仿宋;
}
.lofont1{
  font-family: 仿宋;
}


</style>