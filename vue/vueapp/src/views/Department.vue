<!--html-->
<template>
  <div class="Department">
 <Table :util="{
    httpUrl:'/department',
    params:'',//请求地址
    dname:'科名',
    dperson:'人员数量',
    dphone:'科室电话',
    office:'科室地址',
    }" curpage="1"></Table>

  </div>
</template>

<!--JavaScript-->
<script lang="js">
import {reactive, toRefs} from "vue";


export default {
  name: "Department",
  components: {},


  setup() {
    let state = reactive({
      list: []
    })

    let data = reactive({
      list: []
    })


    return {
      ...state,
      ...toRefs(data),
    }
  }
}
</script>
<!--css-->
<style scoped lang="css">
.Department {


}
</style>