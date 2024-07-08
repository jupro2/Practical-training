<!--html-->
<template>
  <div class="order">

      <Table :util="{
    httpUrl:'/register',
    params:'',//请求地址
    //id:'主键',
    name:'患者姓名',
    age:'年龄',
    state:'状态',
    birth:'就诊日期',
  }" :curpage="1"></Table>

  </div>
</template>

<!--JavaScript-->
<script lang="js">
import {reactive, toRefs} from "vue";


export default {
  name: "order",
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
.order {


}
</style>