<template>
  <div id="app">
    <div class="left-menu" v-if="index&&index!='/'&&index!='/login'">
      <el-menu
          :default-active="index"
          :collapse="collapse"
          :style="{width:collapse?'auto':'200px'}"
          text-color="white" router
          unique-opened
          background-color="#545c64">
        <el-submenu index="折叠"
                    @click.native="toggleCollapse">
          <template slot="title">
            <i class="el-icon-s-operation"></i>
            <span>折叠</span>
          </template>
          <el-menu-item v-if="collapse"
                        @click="toggleCollapse">
            <i class="el-icon-s-operation"></i>
            <span>展开</span>
          </el-menu-item>
        </el-submenu>
        <el-submenu v-for="item in menus" :index="item.index">
          <template slot="title">
            <i :class="'el-icon-'+item.icon"></i>
            <span>{{item.index}}</span>
          </template>
          <el-menu-item :index="bean.path"
                        v-if="!(bean.have)||(bean.have).indexOf(status)!=-1"
                        v-for="bean in item.children">
            <i class="el-icon-menu"></i>
            <span>{{bean.menu}}</span>
          </el-menu-item>
        </el-submenu>
      </el-menu>
    </div>

    <router-view style="height: 100%; overflow: auto;">
    </router-view>

    <el-button class="logout"
               v-if="index&&index!='/'&&index!='/login'"
               plain type="primary" @click="logout">退出登录</el-button>
    <span class="welcome"
          v-if="index&&index!='/'&&index!='/login'">欢迎{{welcome}}</span>
  </div>
</template>

<script>
export default {
  data(){return{
    collapse: false,
    welcome: '',
    menus: [
      { index: '常用', icon: 'platform-eleme', children: [
          { path: '/department', menu: '科室管理', have: ['超级管理员'] },
          { path: '/user', menu: '用户管理', have: ['超级管理员'] },

          { path: '/myorder/order', menu: '我的病号', have: ['医生'] },

          // { path: '/hospital/hospitalList', menu: '医院挂号', have: ['用户'] },
          { path: '/dept/deptList', menu: '科室挂号', have: ['用户'] },
          { path: '/doctor/doctorList', menu: '医生挂号', have: ['用户'] },

        ]},
      { index: '药品', icon: 'platform-eleme', children: [
          { path: '/category', menu: '药品类别', have: ['超级管理员'] },

          { path: '/medicine', menu: '药品信息', have: ['超级管理员','用户','医生'] },

        ]},

      { index: '设置', icon: 'setting', children: [
          { path: '/myorder/my', menu: '个人中心', have: ['用户','医生','超级管理员'] },
          { path: '/feed/feedback', menu: '意见反馈', have: ['用户','医生'] },
          { path: '/feed/feed', menu: '反馈意见', have: ['超级管理员'] },
          { path: '/notice/notice', menu: '系统公告', have: ['超级管理员','用户','医生'] },

        ]},
    ],
    index: '',
    status: '',
  }},
  watch: { // 监听路由变化
    $route(to, from) {
      this.index = to.path;
      localStorage.setItem('index', this.index);
      this.isLogin();
    }
  },
  mounted(){
    this.collapse = JSON.parse(sessionStorage.getItem('collapse'));
    this.index = localStorage.getItem('index');
    if (this.isLogin()) {
      this.$router.push('/login');
    }
  },
  methods: {
    toggleCollapse() {
      this.collapse = !this.collapse;
      sessionStorage.setItem('collapse', this.collapse);
    },
    isLogin() {
      this.status = localStorage.getItem('status');
      if (this.status) {
        this.welcome = this.status + localStorage.getItem('user');
        return false;
      }
      return true;
    },
    logout() {
      localStorage.removeItem('status');
      localStorage.removeItem('user');
      this.$router.push('/login');
    },
  }
}
</script>

<style>
html,body,#app{
  padding:0;
  margin: 0;
  height: 100%;
  overflow: hidden;
}
.left-menu{
  float: left;
  height:100%;
}
.el-menu{
  height: 100%;
  border-right: none;
}
.el-menu-item.is-active{
  background-color: rgba(0,0,0,0.1)!important;
}
.logout{
  position: fixed;
  right: 15px;
  top: 5px;

}
.welcome{
  line-height: 49px;
  position: fixed;
  right: 125px;
  top: 0;
  pointer-events: none;
}
</style>