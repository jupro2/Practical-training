<!--html-->
<template>
  <div class="User">
  <Table :util="{
    httpUrl:'/user',
    params:'',//请求地址
    //id:'主键',
    username:'用户名',
    password:'密码',
    status:'身份/-1'
  }" :curpage="1"></Table>
  </div>
</template>

<!--JavaScript-->
<script lang="js">
import {reactive, toRefs} from "vue";


export default {
  name: "User",
  components: {},


  setup() {
    let state = reactive({
      list: []
    })

    let data = reactive({
      list: []
    })

    let fun = () => {
      return 1;
    }

    return {
      ...state,
      ...toRefs(data),
    }
  }
}
</script>
<!--css-->
<style scoped lang="css">
.User {


}
</style>